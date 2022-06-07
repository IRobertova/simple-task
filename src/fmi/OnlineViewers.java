package fmi;

public class OnlineViewers implements Observer {

	private Observable trainee;
	private Boolean isDown;
	private String name;

	public OnlineViewers(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		if (this.trainee == null) {
			System.out.println("No trainee to watch");
			return;

		}
		this.isDown = this.trainee.getUpdate();
		if (this.isDown) {
			System.out.println(this.name + " is Down");
			return;

		}
		System.out.println(this.name + " is Up");

		// Factory.getToy();
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}

}
