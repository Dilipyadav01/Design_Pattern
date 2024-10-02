package CommandDesignPattern;

import java.util.Stack;

//Invoker
public class MyRemoteControl {
	
	Stack<ICommand> accommandHistory=new Stack<>();
	
	ICommand command;

	public MyRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(ICommand command) {
		this.command=command;
		accommandHistory.add(command);
	}
	
	public void pressButton() {
		command.execute();
	}
	public void undo() {
		if(!accommandHistory.isEmpty()) {
			ICommand lastCommand=accommandHistory.pop();
			lastCommand.undo();
		}
	}
	

}
