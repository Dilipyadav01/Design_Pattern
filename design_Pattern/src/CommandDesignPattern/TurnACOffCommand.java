package CommandDesignPattern;

public class TurnACOffCommand implements ICommand{
	
    AirConditioner ac;
	
	public TurnACOffCommand(AirConditioner ac) {
		this.ac=ac;
	}

	@Override
	public void execute() {
		
		ac.turnoffAC();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.turnonAC();
		
	}
	

}
