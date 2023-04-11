public class MyCircle {
                   private Mypoint center = new Mypoint();
                   private int radius = 1;

                   public MyCircle(int x, int y, int radius) {
                                      center.setX(x);
                                      center.setY(y);
                                      this.radius = radius;

                   };

                   public MyCircle(Mypoint center, int radius) {
                                      this.center = center;
                                      this.radius = radius;
                   };

                   public int getRadius() {
                                      return radius;
                   }

                   public void setRadius(int radius) {
                                      this.radius = radius;

                   }

                   public Mypoint getCenter() {
                                      return center;
                   }

                   public void setCenter(Mypoint center) {
                                      this.center = center;
                   }

                   public int getCenterX() {
                                      return center.getX();
                   }

                   public void setCenterX(int x) {
                                      center.setX(x);
                   }

                   public int getCenterY() {
                                      return center.getY();
                   }

                   public void setCenterY(int y) {
                                      center.setY(y);
                   }

                   public void setCenterXY(int x, int y) {
                                      center.setXY(x, y);
                   }

                   public String toString() {
                                      return "MyCircle[radius=" + radius + ",center=" + center + "]";
                   }

                   public double getArea() {
                                      return radius * radius * Math.PI;
                   }
}
