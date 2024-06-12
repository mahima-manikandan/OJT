class LivingBeing{
    void living(){
        System.out.println("The living beings eats food");
    }
}
class Animal extends LivingBeing{
    void  animal()
    {
        System.out.println("Animals are cute");
    }
}
class Dog extends Animal{
    void dog(){
        System.out.println("The dog is a pet animal");
        }
   
}
public class example2 {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Dog mydog=new Dog();
        myanimal.living();
        myanimal.animal();
        mydog.dog();
        }
    }

    

