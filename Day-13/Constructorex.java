 class rectangle{
    int length, breadth;
    rectangle(){
        System.err.println("Calculating the area od the rectangle");
    }
    void calcarea(int length,int breadth){
         int area=length*breadth;
        System.out.println("The area of the rectangle is"+area);
    
}

public class Constructorex{
    public static void main(String[] args) {
        rectangle rec=new rectangle();
        rec.calcarea(10,25);
    }
}
 }