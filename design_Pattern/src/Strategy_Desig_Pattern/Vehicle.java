package Strategy_Desig_Pattern;

public class Vehicle {
	
	DriveStrategy driveObject;

	public Vehicle(DriveStrategy driveObject) {
		super();
		this.driveObject = driveObject;
	}
	
	public void drive() {
		driveObject.drive();
	}

}
