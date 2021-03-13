/*
 * Name: Tanish Sharma
 * Date: 2/24/2021
 * Purpose: to ask simple arithmetic question to the user in random, and the check the answer
 */

package java_calculator;
import java.util.*;


public class Math {
	public static void main(String[] args) {
		double answer = 0; // init answer var for the question
		String[] operators = {"+", "-", "*", "/"}; // array to store math operators
		boolean run = true; // program keeps running until user wants it
		
		Random random = new Random(); // init random for the program
		
		// init scanner object
		Scanner input = new Scanner(System.in);

		// program loop
		while(run) {
			// pick two random nums for the question
			double num1 = random.nextInt(9) + 1;
			double num2 = random.nextInt(9) + 1;
			
			//pick random index so to pick random operators from the array
			int randomIndex = random.nextInt(operators.length);
			
			// assign the var to a random operator
			String operator = operators[randomIndex];
			
			// output question to the user
			System.out.println("The value of " + num1 + " " + operator + " " + num2 + ":");
			
			// take the answer from the user
			double userInput = input.nextDouble();
			
			// this line is important to avoid errors
			// add this line to skip new line
			input.nextLine(); // throw away '\n' not consumed by input.nextInt()
			
			// based on the operator in the question, computer its correct answer
				if(operator.equals("+")){
					answer = (num1 + num2);
				}
				else if(operator.equals("-")){
					answer = (num1 - num2);
				}
				else if(operator.equals("*")){
					answer = (num1 * num2);
				}
				else{
					answer = (num1 / num2);
				}
					
			// check if the user gets the right answer or not
			if(userInput == answer) {
				System.out.println("Right answer!");
			}
			else {
				System.out.println("Wrong answer :(");
			}
			
			// does user wants to continue or exit the program?
			boolean prompt = true;
			while(prompt) {
				System.out.println("Do you want to exit? y/n: ");
				
				// way to get char (indexed 0) input (y/n) from a string
				char userAnswer = input.next().charAt(0);
				
				// convert char to lowercase
				userAnswer = Character.toLowerCase(userAnswer);
				
				// stores an int value based on the comparison between the desired and the input char
				int compareToY = Character.compare('y', userAnswer);
				int compareToN = Character.compare('n', userAnswer);
				
				// if run is false, main loop stops
				// if prompt is false, no more prompting
				if(compareToY == 0) {
					run = false;
					prompt = false; // prompt false, only if valid input is given
				}
				
				else if(compareToN == 0){
					run = true;
					prompt = false;
				}
				else {
					System.out.println("Error. Wrong input!");
				}
				
			}
			// consume carriage return ("\r") from string before taking an int input
			// causes error otherwise
			String str = input.nextLine();
			
		}
		
		input.close();
		
		System.out.println("End!");
		
	}

}
