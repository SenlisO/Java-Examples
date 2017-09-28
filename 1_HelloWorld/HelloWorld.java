//This is a comment.  It is not run by the computer, but rather is for humans to read
//The "//" starting a line indicates it is a comment
/*
 	You can also create multiline
 	comments by using asterisks and forward slashes
*/

/*
 	Every java program starts with a class with the same name as the java file.
 	Don't worry about what a class is at this point.  Just realize that since
 	this program is called HelloWorld, the class name is also HelloWorld.  We
 	will learn more about classes later.
 	The class also will have a method called "main".  Don't worry about what a method is right now,
 	just know that this marks where the computer will start executing code.
*/
public class HelloWorld
{
	public static void main(String args[])
	{
		//The computer starts executing code here
		
		/*
		 	System.out is a tool we use to print (display) text to the screen.  The specific command is println or "print line".
		 	System.out.println receives what is in parenthesis, prints (displays) it, and moves the cursor to a new line.
		 */
		System.out.println("Hello World");
		//The double quotations indicates the contents are a String (collection of characters).  We will get more into data
		//types later
	} //Curly brackets are used to define blocks of code.  For right now, know that this Curly bracket ends the program.
}