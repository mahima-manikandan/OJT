public class Constructor2 {
    int x=7;
    public Constructor2(int y){
         x=y;
    }
    public static void main(String[] args){
       Constructor2 myobj=new Constructor2(5);
       System.out.println(myobj.x);
}
}