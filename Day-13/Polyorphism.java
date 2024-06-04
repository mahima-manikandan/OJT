//polymorphism -overloading example

class example{
    public void display(){
        System.out.println("Methos without parameter");
    }


public void display(int a){
    System.out.println("Methos with single parameter"+a);
}


public void display(int a,int b){
    System.out.println("Methos with two parameter"+a+" "+b);
}

public void display(double a,double b){
    System.out.println("Methos with different data types"+a+" ,"+b);
}

public void display(double x,int y,String z){
    System.out.println("Methos with mix data types"+x+" ,"+y+" "+z);
}



}

public class Polyorphism {
    public static void main(String[] args) {
        example e = new example();
        e.display(5,4);
        e.display(1.3,8,"mahi");
        e.display();
    }
}
