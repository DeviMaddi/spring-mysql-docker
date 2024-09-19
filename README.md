Here we have performed two crud op  GET and POST, the code is in the files.
We will use mysql from docker and link it with our Spring app and run the app and verify results in postman.

Step 1: to pull mysql image from docker
      For this we use command :
      docker run -p 3306:3306 --name mysql-container -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=testdb -e MYSQL_USER=test-user -e MYSQL_PASSWORD=pass -d mysql
      Here we give port no, container name which is mysql-container, and above mentioned environmental variables , and -d is detach state and mysql which is image name in docker hub.

      In application.properties:
      spring.datasource.url = jdbc:mysql://mysql-container:3306/testdb   // here we provide containername, port and database name
spring.datasource.username = test-user // MYSQL_USER

spring.datasource.password = pass //MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto= update
spring.jpa.show-sql= true
spring.jpa.properties.hibernate.format_sql = true

Step 2:  check the image: docker images  // you will get this mysql-container image in the list
Step 3: now we have to build spring jar image
 we use this command  docker build -t spring-mysql-container.jar .
 Step 4: now check the images: you will find  both the images mysql and spring jar image

 Step 5: to create spring jar container, we use below command
  docker run -p 9090:8080 --link mysql-container --name spring-app a2dc47bfd383
here we link mysql-conatiner with spring-jar image id, it will run the application


      
