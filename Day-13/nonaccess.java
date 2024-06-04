class nonacces{
    public static int a=0;
    public int b=0;
    public final int z=0;

    public nonacces(){
        a++;
        b++;
    }

    public void result(){
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

    }
}
public class nonaccess {
    public static void main(String[] args) {
        nonacces obj1=new nonacces();
        System.out.println("The value of a is " + obj1.a);
        System.out.println("The value of b is " +obj1. b);
        obj1.result();

        nonacces obj2=new nonacces();
        System.out.println("The value of a is " + obj2.a);
        System.out.println("The value of b is " +obj2. b);
        obj2.result();
    }
    
    
    
}
