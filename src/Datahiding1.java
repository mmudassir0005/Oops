
class Rectangle1{
  private double length;
  private double breadth;
    private double getLength() {
        return length;
    }
    private double getBreadth() {
        return breadth;
    }
    public void setLength(double l) {
        if(l>0)
        {
            length = l;
        }
        else
            length =l;
    }
    public void setBreadth(double b) {
        if(b>0) {
            breadth = b;
        }
        else
            breadth=0;
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
    public class Datahiding1
     {
        public static void main(String[]args)
        {
            Rectangle1 r=new Rectangle1();
            r.setLength(-10.5);
            r.setBreadth(5.5);

            System.out.println("Area"+r.area());
            System.out.println("Perimeter "+r.perimeter());
            System.out.println("Is it s squre"+r.issquare());
        }

    }


