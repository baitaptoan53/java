public class Cylinder extends Circle {
                   private double hight = 1;

                   public Cylinder() {
                   }

                   public Cylinder(double radius) {
                                      super(radius);
                   }

                   public Cylinder(double radius, double hight) {
                                      super(radius);
                                      this.hight = hight;
                   }

                   public double getHight() {
                                      return hight;
                   }

                   public double getVolume() {
                                      return getArea() * hight;
                   }
                   public String toString()
                   {
                                      return "Cylinder: subclass of " + super.toString() + " hight=" + hight;

                   }

}
