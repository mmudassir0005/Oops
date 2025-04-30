class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}
class Grandchild extends Child{
    public Grandchild(){
        System.out.println("Grand Child");
    }
}
public class Inheritence3 {
    public static void main(String[]args)
    {
        Grandchild p=new Grandchild();

    }
}
