public class Variables
{
	public static void main(String args[])
	{
		//We aren't going to re-hash the comments from the Hello World example
		
		//The following are variables.  You can think of them as placeholders in memory that
		//have different data types (types of values)
		
		int number = 1000; //This is an integer.  It stores whole numbers from -2,147,483,648 to 2,147,483,648
		//That is 32 bits: 31 bits for the number and 1 bit for the positive or negative sign.
		
		double second_number = 1.25; //This is a double.  It stores numbers with a decimal point
		
		char first_initial = 'R'; //This is a character.  It stores a single letter
		
		String greeting = "Hello World"; //A string is a collection of characters
		
		boolean oxygen_is_good = true; //A boolean can be either true or false
		
		
		//Now that we have defined some data types, we can perform some operations on them
		int answer = 0; //we will store the result of some operation in this variable.
		
		System.out.println(answer); //This should print 0
		
		answer = number + 150; //the '=' is an assignment operator.  It takes whatever the result is on the right
		//and places the result in the variable to the left.
		//Before, answer was 0.  After this operation, answer is now 1150.
		
		System.out.println(answer); //Now it prints 1150
		
		/*
		 note that '=' is not equality.  We are not saying that the left is equal to the right.  For that,
		 we use '=='.  The result of '==' is a boolean, either true or false.  This is an example of a comparison statement
		*/
		
		System.out.println(answer == 1150); //This should print 'true'
		
		//  Valid operations:
		//  + addition
		//  - subtraction
		//  * multiplication
		//  / division
		//  % modulus

		/*
		 *	Valid comparisons
		 *	== 	equal to
		 *	!=	not equal to
		 *	< 	less than
		 *	<= 	less than or equal
		 *	> 	greater than
		 *	>=	greater than or equal
		 */
		
	}
}