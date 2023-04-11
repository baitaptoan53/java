public class Cylinder extends Cricle {
                   private double height = 1;

                   public Cylinder() {

                   }

                   public Cylinder(double radius) {
                                      super(radius);
                   }
                   public Cylinder(double radius, double height) {
                                      super(radius);
                                      this.height = height;
                   }
                   public double getHeight() {
                                      return height;
                   }

                   public double getVolume() {
                                      return getArea() * height;
                   }

}
