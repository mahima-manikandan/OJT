import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.err.println(list.get(2));
        System.err.println(list);
        for(String fruits:list){
            System.err.println(fruits);
        }
    }
}
