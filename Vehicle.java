public class Vehicle {
	protected String vehicleNo;
	protected String vehicleName;
	protected int wheels;

	/**
	* Accelerates the vehicle
	*
	* @return void
	*
	*/

	public void accelerate(int speed) {
		System.out.println("Accelerating at : " + speed + " kmph");
	}
}