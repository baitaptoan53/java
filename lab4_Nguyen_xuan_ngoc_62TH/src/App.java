public class App {
    public static void main(String[] args) throws Exception {
        Mypoint p1 = new Mypoint(3, 0);
        Mypoint p2 = new Mypoint(0, 4);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));

        Mypoint[] points = new Mypoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Mypoint(i + 1, i + 1);
        }
        
    }
}
