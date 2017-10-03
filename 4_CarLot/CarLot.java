/*
 * This example explains classes and objects
 * We have been using classes the entire time have been using java.  Anything that is separated by a period is probably a class
 * For example: System.out.println is from the class System.  This example will explain how we make our own classes.
 */

public class CarLot //This is the class that launches the program, as it has the 'main' function
{ // Usually, these types of classes would be user interface classes
	public static void main(String args[])
	{
		try // this try corresponds to the catch block below.  You will understand more after the next few lines.
		{
			Car my_car = new Car(2004, "Honda", "Accord", "Silver");
			/* In the example above, we create a Car called my_car.  Car is a class (think template) I have defined in Car.java, 
			 * and my_car is an object (think of a creation from the template).  I provided details in the parenthesis
			 * to tell my new car object what it is.  Now, please go to Car.java.
			 */
			
			boolean out_of_gas = false; //this is a local variable
		
			// now you can see our "User Interface class" calling methods from the Car object.
			System.out.println(my_car.get_odometer_reading());
			
			my_car.gas_up();
			out_of_gas = my_car.drive(400);
			
			System.out.println(my_car.get_odometer_reading());
			if (out_of_gas)
			{
				System.out.println("Goint to the gas station");
				my_car.gas_up();
			}
			
			out_of_gas = my_car.drive(200); //we should run out of gas
			
			System.out.println(my_car.get_odometer_reading());
			if (out_of_gas)
			{
				System.out.println("Going to the gas station");
				my_car.gas_up();
			}
			
		}
		catch (IllegalArgumentException e)  // this is the catch block for the Car initiator method
		{
			System.out.println("That is not a valid vehicle");
		}
	}
}