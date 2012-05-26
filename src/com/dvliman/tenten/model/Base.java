package com.dvliman.tenten.model; 

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class Base {
  
  public enum Status {
    ACTIVE, 
    INACTIVE, 
    DELETED, 
    FLAGGED
  }
  
  static {
    ObjectifyService.register(User.class);
    ObjectifyService.register(Topic.class);
    ObjectifyService.register(Comment.class);
  }
  
  public Objectify getService() {
    return ObjectifyService.begin();
  }
  
  public void save() {
    Objectify service = getService();
    service.put(this);
  }

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
    
    Objectify service = getService();
    return (List<?>) service.query(this.getClass()).filter(filter, query);
  }
}