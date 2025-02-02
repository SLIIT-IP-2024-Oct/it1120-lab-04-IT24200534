

import java.util.Scanner;

public class IT24200534Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        // Input exam percentage
        System.out.print("Please enter percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            return;
        }
		
		

        // Input lab percentage
        System.out.print("Please enter percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input for lab percentage. Terminating program.");
            return;
        }
		
		

        // Validate the total percentage
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating program.");
            return;
        }

        // Calculate the final marks
        double finalMarks = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
        System.out.printf("Final Exam mark is: %.2f%n", finalMarks);

        scanner.close();
		
	
    }
	
	
	
	
	
	
}
