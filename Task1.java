import java.util.Scanner;

public class Task1{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int num = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter marks obtained in subject out of 100 in subject "+i+":");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (num * 100) * 100;

        String grade = calculateGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage<=100 && percentage>90) {
            return "A+";
        } else if (percentage>80 && percentage<=90) {
            return "A";
        } else if (percentage <=80 && percentage>70) {
            return "B";
        } else if (percentage <=70 && percentage>60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

