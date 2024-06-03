public class Constructor{
    int x;

    //here creating a class constructor for the constructor class
    public Constructor(){
        x = 10;
    }
    public static void main(String[] args) {
        Constructor myobj=new Constructor();
        System.out.println(myobj.x);
    }
}