//Now that we understand how to create variables and conduct operations on them, we can create a more useful program
//A calculator

import java.util.Scanner; //in this program, we need some extra functionality beyond what Java provides by default.  
//Therefore, we will import the Scanner functionality from the Java libraries.

public class Calculator
{
	public static void main(String args[])
	{
		//first, we will create some variables to work with
		double first_number = 0; 	//we will store the first user's number here
		double second_number = 0; 	//we will store the second user's number here
		String temp = " "; 			//this is a temporary string
		char operand = ' ';			//this is the operator (+, -, *, /, %)
		double answer = 0; 			//and the resulting answer
		Scanner input = new Scanner(System.in); //"Scanner" is what we will use to get data from the user
		//the variable named "input" is a handle we use to interact with the "Scanner" class
		//We will learn more about classes in the next examples
		
		//Read the users first number
		System.out.print("Enter your first number: ");  //this time we use "print" instead of "println" so the
														//cursor does not go to the next line
		first_number = input.nextDouble();  //receive the first number
		
		System.out.print("Enter your second number: ");
		second_number = input.nextDouble(); //receive the second number
		
		System.out.print("Enter your operand ");
		temp = input.next(); //receives user's data and store it in a temporary String
		operand = temp.charAt(0); //retrieves the first character in the temporary variable and store it in variable operand
		//we do this to ensure that only the first character the user enters is used
				
		//at this point, we have the users two numbers and their operand.  We need to decide which operation we need to
		//perform on the two numbers.  To that end, we will use decision statements.
		
		if (operand == '+')  //The if statement evaluates the comparison in the parenthesis.  Note the double equal signs
		{  //if true, the code inside the brackets is executed.  If false, the computer skips the coe inside the brackets
			answer = first_number + second_number;
		}
		else if (operand == '-')  //else if statements are only execute if the previous if/else if was false
		{
			answer = first_number - second_number;
		}
		else if (operand == '/')
		{
			answer = first_number / second_number; 
		}
		else if (operand == '*')
		{
			answer = first_number * second_number;
		}
		else if (operand == '%')
		{
			answer = first_number % second_number;
		}
		else //code in an else block only executes if all previous if and else if statements evaluate to false
		{
			System.out.println("That isn't a valid operand you jerk!");
		}
		
		System.out.println("Your answer is: " + answer);  //in this case, we will append the variable answer to the println using +
		
		input.close();
	}
}