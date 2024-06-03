public class Inheritance {
    public String flower="Rose";
    public void smell(){
        System.out.println("Woow what a fentastic smell is this!!!!~~~");
    }
}
class vegetables extends Inheritance{
    private String flowername="Jasmine";
    public static void main(String[] args) {
        vegetables myvegetables=new vegetables();
        myvegetables.smell();
        System.out.println(myvegetables.flower+""+myvegetables.flowername);
    }
}








