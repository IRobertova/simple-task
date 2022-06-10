package fmi;

public class GetDownCommand implements Command {

	private Trainee trainee;
	
	public GetDownCommand(Trainee trainee) {
		this.trainee=trainee;
	}
	@Override
	public void execute() {
		System.out.println("GET DOWN TRAINEE");
		this.trainee.getDown();
	}

	@Override
	public void undo() {
		System.out.println("GET UP TRAINEE");
		this.trainee.getUp();
	}

}
