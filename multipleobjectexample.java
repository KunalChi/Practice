public class vehicle { 
 
 public static void main(String[] args) {
  //Create 2 objects of class. Both have different reference variables.
  vehicle bicycle = new vehicle("black", 2, 4500, 3.7);
  vehicle motorcycle = new vehicle("Blue", 2, 67000, 74.6);

 }
 
 public vehicle(String color, int wheels, int price, double speed){
  System.out.println("Color = "+color+", Wheels = "+wheels+", Price = "+price+", Speed = "+speed);
 } 
}

/*You can use object of class to access non static variables or methods of class in different class too. 
This way you can use object of class and also you can create multiple objects of any class in java 
software development language.
*/
