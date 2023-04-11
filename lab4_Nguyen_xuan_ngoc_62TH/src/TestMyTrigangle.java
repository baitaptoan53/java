public class TestMyTrigangle {

                   public static void main(String[] args) throws Exception {
                                      MyTriangle t1 = new MyTriangle(0, 0, 1, 1, 2, 5);
                                      MyTriangle t2 = new MyTriangle(new Mypoint(0, 0), new Mypoint(1, 1),
                                                                            new Mypoint(2, 5));
                                      System.out.println(t1);
                                      System.out.println(t2);
                                      System.out.println(t1.getPerimeter());
                                      System.out.println(t2.getPerimeter());
                   }

}
