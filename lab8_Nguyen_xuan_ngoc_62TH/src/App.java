public class App {
    public static void main(String[] args) throws Exception {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " hight=" + c1.getHight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " hight=" + c2.getHight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " hight=" + c3.getHight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
                System.out.println(c3.toString());
    }
     
}
