public class App {
    public static void main(String[] args) throws Exception {

        int x;
        x= 5;
        {
            int y= 6;
            System.out.println(x + ""+y);
        }
            System.out.println(x + ""+y);


    }

}
class San
{
    public void m1(int i,float f)
    {
        System.out.println("int float");
    }
    public void m1(double f,int i)
    {
        System.out.println("float int");
    }
}