class employee{
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
        }
        public void ageinc(){
            age++;
        }
        public void agedec(){
            age--;
        }
        public String getName(){
            return name;
            }
            public int getAge(){
                return age;
                }
                }
public class encapsulation {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setName("Mahima");
        emp.setAge(20);
        System.out.println(emp.getName());
        emp.ageinc();
        System.out.println(emp.getAge());
        emp.agedec();
        System.out.println(emp.getAge());

}}
