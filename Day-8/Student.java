public class Student {
    private String studentId;
    private String name;
    private int age;
    private double grades;
    public Student(String studentId, String name, int age, double grades) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
    public void updateGrades(double newGrades) {
        this.grades = newGrades;
    }
    public void displayInformation() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + grades);
    }
    public static void main(String[] args) {
        Student student1 = new Student("112", "Anagha",23, 3.5);
        student1.displayInformation();

        student1.updateGrades(3.8);
        System.out.println("Updated Grades:");
        student1.displayInformation();
    }
}

