package com.dvliman.tenten.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Id;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.annotation.Cached;
import com.googlecode.objectify.annotation.Unindexed;

public class User{
  @Id private String name; 
  
  public User() {
    super();
  }
  
  public User(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public static Objectify getService() {
    return ObjectifyService.begin();
  }
  
  public void save() {
    Objectify service = getService();
    service.put(this);
  }
}
