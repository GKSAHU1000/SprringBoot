# SprringBoot
 
 
 * Field-based Autowiring
 
Step1. Create a Spring boot Project Via Spring Initializr "https://start.spring.io/"

Step2. 
	 Create three Java classes:
	i. Book (A simple POJO with a &tle and author fields and their respec2ve geSers and seSers).
	ii. Library (Should have a field of type Book).
	iii. Applica&onRunnerImpl (An implementa2on of the Spring's Applica&onRunner interface)
	
	
Step3 : Add Library class inside autowired the Book class and add displayBookDetails method and print the book 

Step4 : in main Application class by uing getBean get the Library object  and call the displayBookDetails method




 *  Constructor-based Autowiring 
 
 Step5 :  Create two more classes:
	i. Student (A simple POJO with name and age fields, and their respec2ve geSers and seSers).
	ii. Classroom (Should have a constructor that accepts an argument of type Student).
	
 Step6 : Add  Classroom inside  using Constructor-based autowired the Student and add displayBookDetails method and print the Student

 Step7 : in main Application class by uing getBean get the Classroom object and call the displayStudentDetails method
