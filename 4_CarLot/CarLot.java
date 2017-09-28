public class CarLot
{
	public static void main(String args[])
	{
		try
		{
		
			Car my_car = new Car(2004, "Honda", "Accord", "Silver");
			boolean out_of_gas = false;
		
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
				System.out.println("Goint to the gas station");
				my_car.gas_up();
			}
			
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("That is not a valid vehicle");
		}
	}
}