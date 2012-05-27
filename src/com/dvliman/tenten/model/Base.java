package com.dvliman.tenten.model; 

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyOpts;
import com.googlecode.objectify.ObjectifyService;

public class Base {
  
  public enum Status {
    ACTIVE, 
    INACTIVE, 
    DELETED, 
    FLAGGED,
    ADMIN
  }
  
  // single instance of {Objectify} object holds Session Cache for all models
  private static ObjectifyOpts opts = new ObjectifyOpts().setSessionCache(true);
  private static final Objectify service = ObjectifyService.begin(opts);
  
  //TODO: make sure static across all request. Use servletcontext
  static {
    ObjectifyService.register(User.class);
    ObjectifyService.register(Topic.class);
    ObjectifyService.register(Comment.class);
  }
  
  public void save() {
    service.put(this);
  }
  
  public void delete() {
    service.delete(this);
  }

  // TODO: delete this function. All datastore writes are transactional.
  public void t_save() {
    Objectify service = ObjectifyService.beginTransaction();
    
    try {
      service.put(this);
      service.getTxn().commit();
    } finally {
      if (service.getTxn().isActive())
        service.getTxn().rollback();
    }
  }
  
  public List<?> query(String filter, String query) {
    if (filter == null)
      return null;
    if (query == null)
      return null;
    
    return (List<?>) service.query(this.getClass()).filter(filter, query);
  }
}