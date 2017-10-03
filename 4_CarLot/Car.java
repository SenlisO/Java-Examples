/*
 * Read comments in CarLot.java first
 * 
 */

public class Car // This is where we define the Car class
{
	// Inside of the car class, we have several variables called attribute.  They store the state of the object
	// These attributes are private, which means only code in the Car class can modify them.
	// The advantage of this is that we can validate in the Car classes that attributes have valid values 
	private int odometer;
	private int fuel_in_miles;
	private String make;
	private String model;
	private String color;
	private int year;
	
	public Car(int year_input, String make_input, String model_input, String color_input)
	{
		// The method (function) that has the same name as the class is the initiator.  it is called when we created the
		// my_car object in CarLot.java.
		
		// This if statement uses other methods in the car object to validate the parameters given have proper values.
		if (valid_year(year_input) && valid_make(make_input) && valid_model(model_input) && valid_color(color_input))
		{
			make = make_input;  //valid input: Honda, Ford or Chevy
			model = model_input;
			color = color_input;
			year = year_input;
			odometer = 0;
			fuel_in_miles = 0;
		}
		else
		{
			throw new IllegalArgumentException("Vehlicle inputs are not valid"); //an exception is an error sent back to
		}  // the function that called it.  An exception should be "caught", see the corresponding code in CarLot.java
	}
	
	// These methods can be used to verify attributes maintain correct values
	private boolean valid_make(String test_make)
	{
		if (test_make == "Honda" || test_make == "Ford" || test_make == "Chevy")
		{
			return true;
		}
		
		return false;
	}
	
	private boolean valid_model(String test_model)
	{
		if (test_model == "Accord" || test_model == "Expedition" || test_model == "Cavalier")
		{
			return true;
		}
		
		return false;
	}
	
	private boolean valid_color(String test_color)
	{
		if (test_color == "Silver" || test_color == "Black" || test_color == "Red")
		{
			return true;
		}
		
		return false;
	}
	
	private boolean valid_year(int test_year)
	{
		if (test_year > 1950 && test_year < 2100)
		{
			return true;
		}
		
		return false;
	}
	
	// The following methods are public, so anyone can use it.  The purposes of which should be readily apparent.
	public void gas_up()
	{
		fuel_in_miles = 420; //remember that fuel_in_miles belongs to this class, review the variables at the beggining
		// of the class definition if necessary
	}
	
	public boolean drive(int miles_to_drive)
	{
		fuel_in_miles = fuel_in_miles - miles_to_drive;
		
		if (fuel_in_miles >= 0)  //we drove the entire distance
		{
			odometer = odometer + miles_to_drive;
			return false;
		}
		
		//fuel_in_miles is negative
		odometer = odometer + miles_to_drive + fuel_in_miles;
		fuel_in_miles = 0;
		return true; //we are out of gas!
	}
	
	// since all the attributes are private, we need a way for the user interface to read the value of those attributes
	public int get_odometer_reading()
	{
		return odometer;
	}
	
}