
import java.util.Scanner;

public class StudentGradeTracker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            sum += grade;
            highest = Math.max(highest, grade);
            lowest = Math.min(lowest, grade);
        }

        double average = (double) sum / numStudents;

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);    
        scanner.close();
    }
}




