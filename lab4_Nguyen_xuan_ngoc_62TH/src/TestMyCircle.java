public class TestMyCircle {
                   public static void main(String[] args) throws Exception {
                                      MyCircle c1 = new MyCircle(3, 1, 5);
                                      MyCircle c2 = new MyCircle(new Mypoint(0, 0), 3);
                                      System.out.println(c1);
                                      System.out.println(c2);
                                      System.out.println(c1.getArea());
                                      System.out.println(c2.getArea());

                   }
}
