public class App {
    public static void main(String[] args) throws Exception {
        Movable m1 = new MovablePoitn(3, 11, 5, 11);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 5, 1, 2, 3);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

    }
}
