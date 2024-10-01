package Strategy_Desig_Pattern;

public class GoodVehicle extends Vehicle{

	public GoodVehicle() {
		super(new NormalDriveStrategy());
	
	}

}
