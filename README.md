# SprringBoot
 
Step1. Craete a Spring boot Project Via Spring Initializr "https://start.spring.io/"


Step2. Select Project -Maven, Lagnuage - Java,  Spring Boot Version -3.1.3, add Group, Package Artifact, Name, Description and select the Spring Web  dependancy and click generate 

Step3. Extract this zip file and open in Eclipes or InteliJ ide etc.


Step4. Craete a sub package like controller, service, repo, model package.


Step5 . and create Student Class with id, name and score and add getter setter, constructor and toString method.


Step6. craete a StudentController, StudentService, StudentRepository classes and intrfaces.


step7. copy the all class and run the project.

step8. open a postman and persorm the action like below

* Add new Student: http://localhost:8081/api/students/add -POST

    request body : {
        "id": 2,
        "name" : "Test2",
        "score" : 4.20
    }


* Get All Students : http://localhost:8081/api/students/getall - GET


* Get Student By Id : http://localhost:8081/api/students/getbyid/9 - GET


* Update the Score : http://localhost:8081/api/students/update/1 - Patch
reqBody score = 20.00


* Delete The Student  : http://localhost:8081/api/students/delete/2 - Delete

* Multiple Entry : http://localhost:8081/api/students/addauto - GET








 