public class FourWheeler extends Vehicle {
	private boolean powerSteer;

	public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {
		vehicleNo = vId;
		vehicleName = vName;
		wheels = numWheels;
		powerSteer = pSteer;
	}

	public void showDetails() {
		System.out.println("Vehicle No: " + vehicleNo);
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Number of Wheels" + wheels);

		if (powerSteer == true) {
			System.out.println("PowerSteer: Yes");
		}
		else {
			System.out.println("PowerSteer: No");
		}
	}
}