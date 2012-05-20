
package com.dvliman.tennedv.datastore;

public class User extends Base {
  private String name; 
  private String description; 
  private String url; 
  
  public void setName(String name) { this.name = name; }
  public void setDescription(String d) { this.description = d; }
  public void setUrl(String url) { this.url = url; }
  
  public String getName() { return this.name; }
  public String getDescription() { return this.description; }
  public String getUrl() { return this.url; }
  
  
}