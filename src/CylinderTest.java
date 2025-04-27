class cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI*radius*radius;
    }

    public double totalsurfaceArea(){
        return 2*lidArea()+circumference();
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}
public class CylinderTest {
    public static void main(String[]args){
    cylinder su=new cylinder();
    su.radius=10;
    su.height=20;
    System.out.println("lisArea:"+su.lidArea());
    System.out.println("totalsurfacearea"+su.totalsurfaceArea());
    System.out.println("volume:"+su.circumference());
    }
}
