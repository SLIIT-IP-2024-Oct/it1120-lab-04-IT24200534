



import java.util.Scanner;

public class IT24200534Lab4Q1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = scanner.nextInt();
		
		if(number > 0){
			System.out.println("The number is Positive");
		} else if (number < 0){
			System.out.println("The number is Negative");
		} else{
			System.out.println("The number is Zero");
		}
		
		scanner.close();
		
	
	}

	
}
