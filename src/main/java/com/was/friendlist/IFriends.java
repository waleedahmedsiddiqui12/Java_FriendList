package com.was.friendlist;

import java.util.Collection;

public interface IFriends<T> {

    void save(T t);
    
    Collection<T> viewAll();
    
    void update(T t);
    
    void delete(T t);
}