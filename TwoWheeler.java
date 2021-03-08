public class TwoWheeler extends Vehicle {
	public TwoWheeler(String vId, String vName, int numWheels) {
		vehicleNo = vId;
		vehicleName = vName;
		wheels = numWheels; 
	}

	public void showDetails() {
		System.out.println("Vehicle No: " + vehicleNo);
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Number of Wheels: " +\ wheels);
	}
}