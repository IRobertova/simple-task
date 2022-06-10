package fmi;

public class GetUpCommand implements Command {

	private Trainee trainee;
	
	public GetUpCommand(Trainee trainee) {
		this.trainee=trainee;
	}
	
	@Override
	public void execute() {
		System.out.println("GET UP TRAINEE");
		this.trainee.getUp();
	}

	@Override
	public void undo() {
		System.out.println("GET DOWN TRAINEE");
		this.trainee.getDown();
	}

}
