package com.dvliman.tenten.model;

import javax.persistence.Id;

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
