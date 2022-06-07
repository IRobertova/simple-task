package fmi;

public class Trainer {

	private static Trainer instance;
	
	private Command command;

	private Trainer() {
		
	}
	public static Trainer getInstance() {
		if(instance==null) {
			instance = new Trainer();
		}
		return instance;
	}
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void coach() {
		if(this.command==null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}
	
}
