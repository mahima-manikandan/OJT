import java.util.HashSet;
public class TwoSum {
    private HashSet<Integer> set;
    public TwoSum() {
        set = new HashSet<Integer>();
    }
    public void add(int number) {
        set.add(number);
    }
    public boolean find(int value) {
        for (int num : set) {
            int complement = value - num;
            if (set.contains(complement) && complement!= num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);

        System.out.println(twoSum.find(4));  // true
        System.out.println(twoSum.find(7));  // false
    }
}