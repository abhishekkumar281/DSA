import java.util.HashMap;
import java.util.Scanner;

public class Gradebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, HashMap<String, Double>> grades = new HashMap<>();

        // Input loop for students
        while (true) {
            System.out.print("Enter student name (or 'quit' to exit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            // Input loop for subject scores
            HashMap<String, Double> studentGrades = new HashMap<>();
            while (true) {
                System.out.print("Enter subject name (or 'done' to finish): ");
                String subject = scanner.nextLine();

                if (subject.equalsIgnoreCase("done")) {
                    break;
                }

                System.out.print("Enter score for " + subject + ": ");
                double score = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character

                studentGrades.put(subject, score);
            }

            grades.put(name, studentGrades);
        }

        // Calculate and display average scores
        for (String name : grades.keySet()) {
            HashMap<String, Double> studentGrades = grades.get(name);
            double totalScore = 0;
            int subjectCount = studentGrades.size();

            for (double score : studentGrades.values()) {
                totalScore += score;
            }

            double average = subjectCount > 0 ? totalScore / subjectCount : 0.0;

            System.out.println("\nStudent: " + name);
            System.out.println("Average Score: " + average);
        }

        scanner.close();
    }
}
