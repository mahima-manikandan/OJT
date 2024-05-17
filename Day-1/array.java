public class array {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String searchString = "hello";
        
        // Perform array operations
        int sum = 0;
        int max = array[0];
        int min = array[0];
        boolean stringFound = false;

        for (int num : array) {
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (String.valueOf(num).equals(searchString)) {
                stringFound = true;
                break;
            }
        }

        double average = (double) sum / array.length;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("String '" + searchString + "' found: " + stringFound);
    }
}
