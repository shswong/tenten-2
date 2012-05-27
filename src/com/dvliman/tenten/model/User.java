package com.dvliman.tenten.model;

import javax.persistence.Id;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class User extends Base {
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
}
