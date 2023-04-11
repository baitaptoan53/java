public class Cricle {
                   private double radius = 1;
                   private String color = "red";

                   public Cricle(double radius) {
                                      this.radius = radius;
                   }

                   public Cricle() {

                   }

                   public double getRadius() {
                                      return radius;
                   }

                   public double getArea() {
                                      return radius * radius * Math.PI;
                   }

                   public String toString() {
                                      return "Cricle[radius=" + radius + "]";
                   }
}
