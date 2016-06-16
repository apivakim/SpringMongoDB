package com.project.main;

import com.mongodb.MongoClient;
import com.project.model.Person;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.net.UnknownHostException;

/**
 * Created by littleTears on 2016-06-16.
 */
public class SpringDataMongoDBMain {

    public static final String DB_NAME = "testdb";
    public static final String PERSON_COLLECTION = "person";
    public static final String MONGO_HOST = "localhost";
    public static final int MONGO_PORT = 27017;

    public static void main(String[] args){

        try {

            MongoClient mongo = new MongoClient(MONGO_HOST,MONGO_PORT);
            MongoOperations mongoOps = new MongoTemplate(mongo,DB_NAME);
            Person person = new Person("113","ApivaKim","Bangkok, Thailand");
            mongoOps.insert(person,PERSON_COLLECTION);
            Person person1 = mongoOps.findOne(new Query(Criteria.where("name").is("ApivaKim")),
                    Person.class,PERSON_COLLECTION);
            System.out.println(person1);
            mongoOps.dropCollection(PERSON_COLLECTION);
            mongo.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


}
