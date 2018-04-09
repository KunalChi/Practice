public class Methodexample {

 public static void main(String[] args) {
  Test1(); //Test1() method called inside main method.
  
 }
 
 public static void Test1(){ //Simple Method - Called from main method.
  System.out.println("Test1 Method Executed.");
 }
 
 public static void Test2(){ //Simple Method - Not called from main method.
  System.out.println("Test2 Method Executed.");
 }

}

