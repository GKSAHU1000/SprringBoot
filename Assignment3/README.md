# SprringBoot
 
Step1. Create a Spring boot Project Via Spring Initializr "https://start.spring.io/"


Step2. Select Project -Maven, Language - Java,  Spring Boot Version -3.1.3, add Group, Package Artifact, Name, Description select the Spring Web  dependency, and click generate 

Step3. Extract this zip file and open it in Eclipse or InteliJ ide etc.


Step4. Create a sub-package like a controller, service, repo, or model package.


Step 5. create Student Class with id, name, and score and add getter setter, constructor, and toString method.


Step6. craete a StudentController, StudentService, StudentRepository classes and intrfaces.


step7. copy the classes and run the project.

step8. open a postman and perform the action below

* Add new Student: http://localhost:8081/api/students/add -POST

    request body: {
        "id": 2,
        "name": "Test2",
        "score": 4.20
    }


* Get All Students: http://localhost:8081/api/students/getall - GET


* Get Student By Id: http://localhost:8081/api/students/getbyid/9 - GET


* Update the Score: http://localhost:8081/api/students/update/1 - Patch

Request Body score = 20.00


* Delete The Student: http://localhost:8081/api/students/delete/2 - Delete

* Multiple Entry : http://localhost:8081/api/students/addauto - GET








 