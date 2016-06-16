package com.project.dao;

import com.mongodb.WriteResult;
import com.project.model.Person;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by littleTears on 2016-06-16.
 */
public class PersonDAOImpl implements PersonDAO {

    private MongoOperations mongoOps;
    private static final String PERSON_COLLECTION = "person";

    public PersonDAOImpl(MongoOperations mongoOps){
        this.mongoOps = mongoOps;
    }

    public void create(Person p) {
        this.mongoOps.insert(p,PERSON_COLLECTION);
    }

    public Person readById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return this.mongoOps.findOne(query,Person.class,PERSON_COLLECTION);
    }

    public void update(Person p) {
        this.mongoOps.save(p,PERSON_COLLECTION);
    }

    public int deleteById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        WriteResult result = this.mongoOps.remove(query,Person.class,PERSON_COLLECTION);
        return result.getN();
    }
}
