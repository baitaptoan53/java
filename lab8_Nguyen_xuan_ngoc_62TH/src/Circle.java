public class Circle {
                   private double radius = 1;
                   private String color = "red";

                   public Circle() {
                   }

                   public Circle(double radius) {
                                      this.radius = radius;
                   }

                   public double getRadius() {
                                      return radius;
                   }

                   public double getArea() {
                                      return radius * radius * Math.PI;
                   }

                   public String toString() {
                                      return "Circle radius = " + radius + " ";
                   }
}
