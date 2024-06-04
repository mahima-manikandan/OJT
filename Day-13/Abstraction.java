abstract class car{
    car(){
        System.out.println("Owner is Mahi");
    }
    abstract void brandName();
    public void color(){
        System.out.println("The color of the car is black");
    }

    }

    class car1 extends car{
        public void brandName(){
            System.out.println("The brand name of the car is Toyota");
        }
    }

    class car2 extends car{
        public void brandName(){
            System.out.println("The brand name of the car is Audi");
        }
    }
public class Abstraction {
    public static void main(String[] args) {
        car obj=new car1();
        obj.brandName();
        obj.color();   
    }
}
