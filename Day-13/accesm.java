//access modifires-public private,protected
//non-access modifires-static,final,abstract

class sample{
    public int x=9;
    private int y=4;
    private static int q =0;
    private static void increment(){
        q++;
    }

    
    // void data(){
    //     private int q=55;
    // }
    void show(){
        System.out.println("The value of x is " +x);
        System.out.println("The value of y is " +y);
        sample.increment();
        System.out.println("The value of q is " +q);

    }
}



public class accesm {
    public static void main(String[] args) {
        sample myobj = new sample();
        // myobj.data();
        myobj.show();
        // System.out.println(y);//we cant access this becouse this y is private .... it online accessable in their class
    }
}
