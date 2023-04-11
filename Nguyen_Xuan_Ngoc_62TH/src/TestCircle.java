public class TestCircle { // save as "TestCircle.java"
                   public static void main(String[] args) {
                                      // Declare and allocate an instance of class Circle called c1
                                      // with default radius and color
                                      Circle c1 = new Circle(5.0);
                                      // Use the dot operator to invoke methods of instance c1.
                                      System.out.println(c1.toString()); // explicit call
                                      // Declare and allocate an instance of class circle called c2
                                      // with the given radius and default color
                                      Circle c2 = new Circle(1.2);
                                      // Use the dot operator to invoke methods of instance c2.
                                      System.out.println(c2.toString());
                                      System.out.println(c2);
                                      System.out.println("Operator '+' invokes toString() too: " + c2);
                                      // Declare and allocate an instance of class circle called c3
                                      // with the given radius and color
                                      Circle c3 = new Circle();
                                      // Use the dot operator to invoke methods of instance c3.
                                      c3.setRadius(2.0);
                                      c3.setColor("green");
                   }
}