package Strategy_Desig_Pattern;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportDriveStrategy());
		
	}
	

}
