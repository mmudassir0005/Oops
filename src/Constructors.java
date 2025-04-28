class RectangleConst{
    private double length;
    private double breadth;

    public RectangleConst(){
        length=1;
        breadth=1;
    }
    public RectangleConst(double l,double b)
    {
        length=l;
        breadth=b;
    }
    public RectangleConst(double s)
    {
        length=breadth=s;
    }
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

public class Constructors {
    public static void main(String[]args)
    {
        RectangleConst r=new RectangleConst();


        System.out.println("Area"+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is it s squre"+r.issquare());
    }

}



