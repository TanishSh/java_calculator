/*
 * Name: Tanish Sharma
 * Date: 2/24/2021
 * Purpose: to ask simple arithmetic question to the user in random, and the check the answer
 */

package calculator;
import java.util.*;


public class Math {
	public static void main(String[] args) {
		double answer = 0; // init answer var for the question
		String[] operators = {"+", "-", "*", "/"}; // array to store math operators
		boolean run = true; // program keeps running until user wants it
		
		Random random = new Random(); // init random for the program

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
			Scanner input = new Scanner(System.in);
			double userInput = input.nextInt();
			
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
				
				// way to get char input (y/n)
				
				String userAnswer = input.nextLine();
				userAnswer = userAnswer.toLowerCase();
				userAnswer = userAnswer.replaceAll("\\s+", "");
				
				// if run is false, main loop stops
				// if prompt is false, no more prompting
				if(userAnswer.equals 'y') {
					run = false;
					prompt = false; // prompt false, only if valid input is given
				}
				else if(userAnswer == 'n'){
					run = true;
					prompt=false;
				}
				else {
					System.out.println("Error. Wrong input!");
				}
			}
			
			input.close();
			
		}
		System.out.println("End!");
		
	}

}
