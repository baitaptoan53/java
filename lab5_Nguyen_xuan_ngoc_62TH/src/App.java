public class App {
    public static void main(String[] args) throws Exception {

        MyComplex c1 = new MyComplex(3, 4);
        MyComplex c2 = new MyComplex(3, 4);
        MyComplex c3 = new MyComplex(3, 5);
        MyComplex c4 = new MyComplex(4, 4);

        System.out.println("c1 is " + c1);
        System.out.println("c2 is " + c2);
        System.out.println("c3 is " + c3);
        System.out.println("c4 is " + c4);

        System.out.println("c1 is real? " + c1.isReal());
        System.out.println("c1 is imaginary? " + c1.isImaginary());
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals c3? " + c1.equals(c3));
        System.out.println("c1 equals c4? " + c1.equals(c4));

        System.out.println("c1 + c2 is " + c1.add(c2));
        System.out.println("c1 - c2 is " + c1.subtract(c2));
        System.out.println("c1 * c2 is " + c1.multiplyWith(c2));
        System.out.println("c1 / c2 is " + c1.divideBy(c2));

        System.out.println("c1's argument is " + c1.argumentInDegrees());
        System.out.println("c2's argument is " + c2.argumentInDegrees());
        System.out.println("c3's argument is " + c3.argumentInDegrees());
        System.out.println("c4's argument is " + c4.argumentInDegrees());

        System.out.println("c1's magnitude is " + c1.magnitude());
        System.out.println("c2's magnitude is " + c2.magnitude());
        System.out.println("c3's magnitude is " + c3.magnitude());
        System.out.println("c4's magnitude is " + c4.magnitude());

        System.out.println("c1's conjugate is " + c1.conjugate());
        System.out.println("c2's conjugate is " + c2.conjugate());
        System.out.println("c3's conjugate is " + c3.conjugate());
        System.out.println("c4's conjugate is " + c4.conjugate());

    }
}
