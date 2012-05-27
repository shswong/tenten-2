package com.dvliman.tenten.model; 

import javax.persistence.Id;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Cached;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Parent;

@Cached
@Entity
public class Topic extends Base {
  
  @Id private Long id;
  
  private Link link;
  private String content;
  private String title;
  private String category;
  
  @Parent Key<User> owner;
  
  public void setOwner(User owner) {
    this.owner = new Key<User>(User.class, owner.getName());
  }

  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}