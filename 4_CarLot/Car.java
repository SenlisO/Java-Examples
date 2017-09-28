public class Car
{
	private int odometer;
	private int fuel_in_miles;
	private String make;
	private String model;
	private String color;
	private int year;
	
	public Car(int year_input, String make_input, String model_input, String color_input)
	{
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
			throw new IllegalArgumentException("Vehlicle inputs are not valid");
		}
	}
	
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
	
	public void gas_up()
	{
		fuel_in_miles = 420;
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
	
	public int get_odometer_reading()
	{
		return odometer;
	}
	
}