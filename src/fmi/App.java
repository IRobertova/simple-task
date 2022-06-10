package fmi;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer trainer = Trainer.getInstance();
		Trainee trainee = new Trainee();
		
		Command getUpCommand = new GetUpCommand(trainee);
		Command getDownCommand = new GetDownCommand(trainee);
		
		OnlineViewers viewer1 = new OnlineViewers("pesho");
		OnlineViewers viewer2 = new OnlineViewers("ivan");
		OnlineViewers viewer3 = new OnlineViewers("gosho");
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		trainer.setCommand(getUpCommand);
		trainer.coach();
		
		trainer.setCommand(getDownCommand);
		trainer.coach();

	}

}
