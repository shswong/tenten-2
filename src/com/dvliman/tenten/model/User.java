package com.dvliman.tenten.model;

import static com.dvliman.tenten.model.Base.*;

import javax.persistence.Transient;

//@Entity("u")
//@Cacheable
public class User{
  private String screen_name;
  private String display_name; 
  //@Unindexed private String display_picture;
  @Transient String password; 
  
  public void setName(String name) { screen_name = name; }
  public void setDisplayName(String name) { display_name = name; }
  
  public String getName() { return screen_name; }
  public String getDisplayName() { return display_name; }
  
}