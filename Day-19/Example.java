class Vehicle{
    void type(){
        System.out.println("The Type of the car is Ambassador");
    }
}
class car extends Vehicle{
    void brand()
    {
        System.out.println("The cars Brand is BMW");
    }
}

public class Example {
    public static void main(String[] args) {
        car mycar=new car();
        mycar.type();
        mycar.brand();
    }
    
}
