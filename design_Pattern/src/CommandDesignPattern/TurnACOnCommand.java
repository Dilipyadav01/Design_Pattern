package CommandDesignPattern;

public class TurnACOnCommand implements ICommand{
    
	
	AirConditioner ac;
	
	public TurnACOnCommand(AirConditioner ac) {
		this.ac=ac;
		
	}
	@Override
	public void execute() {
		ac.turnonAC();
		
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.turnoffAC();
	}
	

	

}
