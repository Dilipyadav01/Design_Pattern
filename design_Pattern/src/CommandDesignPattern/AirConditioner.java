package CommandDesignPattern;

//Receiver
public class AirConditioner {
	
	boolean isOn;
	int temperature;
	 public void turnonAC() {
		 isOn=true;
		 System.out.println("AC is On");
	 }
	 public void turnoffAC() {
		 isOn=false;
		 System.out.println("AC is Off");
	 }
	 public void setTempature(int temp) {
		 this.temperature=temp;
		 System.out.println("Temperature change to:" + temperature);
	 }
	 

}
