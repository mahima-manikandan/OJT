import java.lang.*;

class parent{
    void display(){
        System.out.println("Parent class method");
    }
}
class child extends parent{
    @Override
    void display(){
        System.out.println("Child class method");
}
}
public class Annotationsex {
    public static void main(String[] args) {
        parent p = new child();
        p.display();
    }
        
    }

