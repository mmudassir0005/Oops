class Super
{
    public void display()
    {
        System.out.println( "Super Class Display");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Class Display");
    }
}
public class Overriding {
    public static void main(String[]args)
    {
        Super sup=new Sub();//dynamic method dispatch
        sup.display();

    }
}
