//Now that we understand how to create variables and conduct operations on them, we can create a more useful program
//A calculator

import java.util.Scanner;; //in this program, we need some extra functionality beyond what Java provides by default.  
//Therefore, we will import the Scanner functionality.

public class Calculator
{
	public static void main(String args[])
	{
		//first, we will create some variables to work with
		double first_number = 0; 	//we will store the first user's input here
		double second_number = 0; 	//we will store the second user's input here
		String operand = " "; 		//the operation the user wants to conduct
		double answer = 0; 			//and the resulting answer
		Scanner input = new Scanner(System.in); //this Scanner is what we will use to get input from the user
		//the variable named "input" is a handle we use to interact with the "Scanner" class
		//We will learn more about classes in a couple examples
		
		//now, read the users input
		System.out.print("Enter your first number: "); //this time we use "print" instead of "println" so the
		//cursor does not go to the next line
		first_number = input.nextDouble();  //receive the first number
		
		System.out.print("Enter your second number: ");
		second_number = input.nextDouble(); //receive the second numbers
		
		System.out.print("Enter your operand ");
		operand = input.next(); //receive the operand
		
		//at this point, we have the users two numbers and their operand.  We need to decide which operation we need to
		//perform on them.  To that end, we will use decision statements.
		
		//we will have to use the charAt(0) on the string operand so we only evaluate the first character of the operand
		//otherwise, these comparisons don't work
		
		if (operand.charAt(0) == '+')  //The if statement evaluates the comparison in the parenthesis.  Note the double equal signs
		{  //if true, the code inside the if statement is executed
			answer = first_number + second_number;
		}  //if false, the computer skips the code inside the if statement
		else if (operand.charAt(0) == '-')  //else if evaluates inside the parenthesis only in the case  the previous if/else if statement is false
		{  //in the case the previous if statement was true, this else if would never be evaluated
			answer = first_number - second_number;
		}
		else if (operand.charAt(0) == '/')
		{
			answer = first_number / second_number; //what if second_number is 0.  We will get to that in the next example
		}
		else if (operand.charAt(0) == '*')
		{
			answer = first_number * second_number;
		}
		else if (operand.charAt(0) == '%')
		{
			answer = first_number % second_number;
		}
		else //code in an else block only executes if all previous if and else if statements evaluate to false
		{
			System.out.println("That isn't a valid operand you jerk!");
		}
		
		System.out.println("Your answer is: " + answer);  //in this case, we will append the variable answer to the println using +
	}
}