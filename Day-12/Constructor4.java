public class Constructor4 {
    String Mother;
    String Father;
    public Constructor4(String Mom, String Dad){
        Mother=Mom;
        Father=Dad;
    }
    public static void main(String[] args) {
        Constructor4 parents=new Constructor4("Manikandan","Lathika");
        System.out.println(parents.Mother+" " +parents.Father);
    }
}









