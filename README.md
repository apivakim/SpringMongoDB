#Spring Framwork and integrade MONGODB

   Spring Framework config for use mongodb(concept no sql) for begin.

###Running Project
  1. install mongodb
  
      *[`https://www.mongodb.com/download-center?jmp=docs&_ga=1.207095062.460601489.1465185150#community`](https://www.mongodb.com/download-center?jmp=docs&_ga=1.207095062.460601489.1465185150#community)*


  2. start service of mongodb

   For windows:

    *[`https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/`](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/)*


   For Other OS:

    *[`https://docs.mongodb.com/manual/tutorial/`](https://docs.mongodb.com/manual/tutorial/)*


   3. install Robomongo 

    *[`https://robomongo.org/download`](https://robomongo.org/download)*

   4. create database in mongodb(use Robomongo Programe)
   
   name:testdb
~~~
   use testdb  
   db.users.save( {username:"testdb"} )
   db.users.find()
   show dbs
~~~
   5. create collection of db(that is table in RDBMS Database)
   
   name:person
~~~
   db.createCollection("person", { size: 2147483648 } )
~~~

   4. install SDK8 and maven(for spring framework)
   5. import maven project
   6. run as Java Application in pakage main


###Command for query data in mongodb 
~~~ 
    use testdb
    db.person.find()
~~~  
   

###Resource:
   *[`http://www.journaldev.com/4144/spring-data-mongodb-example-tutorial`](http://www.journaldev.com/4144/spring-data-mongodb-example-tutorial)*

