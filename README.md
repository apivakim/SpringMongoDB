#Spring Framwork and integrade MONGODB

   Spring Framework config for use mongodb(concept no sql) for begin.

###Running Project

   1. download mongodb
   2. install and start service of mongodb
   3. install Robomongo Programe. 
   5. create database in mongodb(use Robomongo Programe)
   6. create collection of mongodb(that is table in RDBMS Database)
   7. install SDK8 and maven(for spring framework)
   8. import maven project
   9. run as Java Application in pakage main


###Link 

- download mongodb

  *[`https://www.mongodb.com/download-center?jmp=docs&_ga=1.207095062.460601489.1465185150#community`](https://www.mongodb.com/download-center?jmp=docs&_ga=1.207095062.460601489.1465185150#community)*
  
- install and start service mongodb
   
   For windows:

    *[`https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/`](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/)*


   For Other OS:

    *[`https://docs.mongodb.com/manual/tutorial/`](https://docs.mongodb.com/manual/tutorial/)*
    
- install Robomongo Programe
   
    *[`https://robomongo.org/download`](https://robomongo.org/download)*
 
 
###Command for mongodb 

- query data
~~~ 
    use testdb
    db.person.find()
~~~  

- create database

    name for use this project: testdb
~~~
   use testdb  
   db.users.save( {username:"testdb"} )
   db.users.find()
   show dbs
~~~

- create collection

    name for use this projec:person
~~~
   db.createCollection("person", { size: 2147483648 } )
~~~

###Resource:
   *[`http://www.journaldev.com/4144/spring-data-mongodb-example-tutorial`](http://www.journaldev.com/4144/spring-data-mongodb-example-tutorial)*

