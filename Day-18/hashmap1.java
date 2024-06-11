import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
     HashMap<String,Integer> map = new HashMap<String,Integer>();
     map.put("Apple",1);
     map.put("Orange",2);
     map.put("Berry",3);
     map.put("Grapes",4);
     System.out.println("Value @ key 1 is:"+map.get("Apple"));
    //  System.out.println("Initial map is "+map);
    for(String key:map.keySet()){
        System.out.println("Key is "+key+" Value is "+map.get(key));
    }
    //for replace purpose we can use the  replace method.help the update or replace the existing value to new valuye
    }
}
