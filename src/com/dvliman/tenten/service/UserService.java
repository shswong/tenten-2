package com.dvliman.tenten.service;

import javax.inject.Inject;

import org.simpleds.CursorList; 
import org.simpleds.EntityManager;
import org.simpleds.annotations.Transactional;

import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.Key; 
import com.google.appengine.api.datastore.Transaction;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

import com.dvliman.tenten.model.User;

public class UserService {
  @Inject
  private EntityManager em; 
  
  /*
  private static Predicate<User> NOT_DELETED = new Predicate<User>() {
    public boolean apply(User input) {
      return !input.isDeleted();
    }
  };*/
 
  public User save(User u) {
    Transaction tx = em.beginTransaction();
    User persist = em.get(tx, u.getKey());
    persist.setName( u.getName() );
    em.put(tx, persist);
    return persist;
  }
}