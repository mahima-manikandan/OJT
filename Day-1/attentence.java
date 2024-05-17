import java.util.Scanner;

public class attentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for number of classes held and attended
        System.out.println("Enter the number of classes held:");
        int classesHeld = scanner.nextInt();
        
        System.out.println("Enter the number of classes attended:");
        int classesAttended = scanner.nextInt();
        
        // Calculating percentage of classes attended
        double attendancePercentage = (double) classesAttended / classesHeld * 100;
        
        // Checking if the student is allowed to sit in the exam
        if (attendancePercentage >= 75) 
            System.out.println("Student is allowed to sit in the exam.");
        else 
            System.out.println("Student is not allowed to sit in the exam.");
        
        scanner.close();
    }
}
