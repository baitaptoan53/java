public class MyTriangle {
                  private Mypoint v1 = new Mypoint(0, 0);
                   private Mypoint v2 = new Mypoint(1, 1);
                   private Mypoint v3 = new Mypoint(2, 5);
                   public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
                                      v1.setXY(x1, y1);
                                      v2.setXY(x2, y2);
                                      v3.setXY(x3, y3);
                   }
                   public MyTriangle(Mypoint v1, Mypoint v2, Mypoint v3) {
                                      this.v1 = v1;
                                      this.v2 = v2;
                                      this.v3 = v3;
                   }
                   public String toString() {
                                      return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
                   }
                   public double getPerimeter() {
                                      return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
                   }
}
