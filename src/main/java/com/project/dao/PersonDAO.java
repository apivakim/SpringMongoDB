package com.project.dao;

import com.project.model.Person;

/**
 * Created by littleTears on 2016-06-16.
 */
public interface PersonDAO {

    public void create(Person p);
    public Person readById(String id);
    public void update(Person p);
    public int deleteById(String id);

}
