class RectangleTest{
     double length;
     double breadth;

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean issquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}

public class Rectangle {
    public static void main(String[]args)
    {
        RectangleTest r=new RectangleTest();
        r.length=10.5;
        r.breadth=5.5;

        System.out.println("Area"+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is it s squre"+r.issquare());
    }

}
