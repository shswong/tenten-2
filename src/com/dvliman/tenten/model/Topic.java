package com.dvliman.tenten.model; 

import javax.persistence.Id;

import com.google.appengine.api.datastore.Link;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Parent;
import com.googlecode.objectify.annotation.Unindexed;

@Unindexed
public class Topic extends Base {
  
  @Id private Long id;
  
  private Link link;
  private String content;
  private String title;
  //private List<String> tags;
  
  @Parent Key<User> owner;
  
}