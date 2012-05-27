package com.dvliman.tenten.model; 

import javax.persistence.Id;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Cached;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Parent;

@Cached
@Entity
public class Comment extends Base {
  @Id private Long id;
  
  private Key<User> owner;
  private Key<Topic> topic; 
  private String content;
  
  public void setOwner(Key<User> owner) {
    this.owner = new Key<User>(User.class, owner.getName());
  }
  
  // TODO: type casting this
  //public User getOwner() {
  //  return (Key) this.owner;
  //}
  
  public Key<Topic> getTopic() {
    return topic;
  }
  
  public void setTopic(Key<Topic> topic) {
    this.topic = new Key<Topic>(Topic.class, topic.getId());
  }
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
}