public class Constructor3 {
    int myage;
    String myname;

public Constructor3(int age,String name){
    myage=age;
    myname=name;
}
public static void main(String[] args) {
    Constructor3 aboutme=new Constructor3(20,"mahi");
    System.out.println(aboutme.myage+""+aboutme.myname);
}
}
