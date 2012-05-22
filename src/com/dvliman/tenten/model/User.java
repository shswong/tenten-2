package com.dvliman.tenten.model;

import static com.dvliman.tenten.model.Base.*;

import org.simpleds.KeyFactory2;
import org.simpleds.annotations.Cacheable;
import org.simpleds.annotations.Entity;
import org.simpleds.annotations.Id;
import org.simpleds.annotations.Property;
import org.simpleds.converter.StringToTextConverter;

import com.google.appengine.api.datastore.Key;

@Entity("u")
@Cacheable
public class User{
  
  @Id @Property(KEY)
  private Key key;
  
  @Property(required = true, value=NAME)
  private String screen_name;
  
  @Property(required=true, value=DELETED)
  private boolean deleted;
  
  public boolean isDeleted() {
    return deleted;
  }
  
  public Key getKey() {
    return key;
  }
  
  public void setKey(Key key) {
    this.key = key;
  }
  
  public String getName() {
    return screen_name; 
  }
  
  public void setName(String name) {
    screen_name = name;
  }
}