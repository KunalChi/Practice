/* What Is An Object In Java?
If Interviewer ask you this question then your answer should be like this : Object Is an Instance of class. 
In other words we can say object Is bundle of related methods and variables. Every object has Its own states and behavior. 
Objects are generally used with constructors In java software development language. Understanding of object Is very Important 
for Selenium WebDriver software testing tool learner because we have to create and use objects In our test case development 
of software web applications. We can create multiple objects for the same class having Its own property in java software 
development language.
*/
public class vehicle { 
 public static void main(String[] args) {
  //Created object for vehicle class using new keyword.
  //bicycle is the reference variable of this object.
  vehicle bicycle = new vehicle("Black");
  
 } 
 //Constructor with color parameter passed. It will retrieve value from object vehicle. 
 public vehicle(String color){
  //Retrieved value will be printed.
  System.out.println("Color Of vehicle Is "+color);  
 } 
}

/*In above example, Used one constructor to pass the value of object. We will look about constructor In my upcoming post. 
Please remember here one thing - bicycle Is not an object. It Is reference variable of object vehicle. Based on this example, 
Now we can say that object has three parts as below.
Declaration : Variable declaration for object. In this example, bicycle is the reference variable for object.
Instantiation : Object creation using new keyword Is called as Instantiation.
Initialization : Call to a constructor Is known as object initialization.
*/
