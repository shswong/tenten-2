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

  private static final Objectify service = ObjectifyService.begin();
  
  static {
    ObjectifyService.register(User.class);
    ObjectifyService.register(Topic.class);
    ObjectifyService.register(Comment.class);
  }
  
  public static Objectify getService() {
    return service;
  }
  
  public void save() {
    service.put(this);
  }
  
  // TODO: throw correct exception
  public List<?> query(String filter, String query) {
    if (filter == null)
      throw new NullPointerException();
    if (query == null)
      throw new NullPointerException();
    
    return (List<?>) service.query(this.getClass()).filter(filter, query);
  }
}