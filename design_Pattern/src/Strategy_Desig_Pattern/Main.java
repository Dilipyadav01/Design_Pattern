package Strategy_Desig_Pattern;

import CommandDesignPattern.AirConditioner;
import CommandDesignPattern.MyRemoteControl;
import CommandDesignPattern.TurnACOnCommand;

public class Main {

	public static void main(String[] args) {
		
		AirConditioner airConditioner=new AirConditioner();
		MyRemoteControl remoteObj=new MyRemoteControl();
		remoteObj.setCommand(new TurnACOnCommand(airConditioner));
		 remoteObj.pressButton();
		 remoteObj.undo();
		
		
		// TODO Auto-generated method stub
		//Strategy pattern
		//Vehicle vehicle=new OffRoadVehicle();
		//vehicle.drive();
		//Vehicle vehicle=new GoodVehicle();
		//vehicle.drive();

	}

}
