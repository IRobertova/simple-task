package fmi;

import java.util.List;

public class Trainee implements Observable {
	private Boolean isDown;
	private List<Observer> onlineObservers;
	
	public void getDown() {
		System.out.println("Trainee is down");
		this.isDown=true;
		this.notifyObservers();
	}
	
	public void getUp() {
		System.out.println("Trainee is up");
		this.isDown=false;
		this.notifyObservers();
	}

	@Override
	public void subscribe(Observer observer) {
		this.onlineObservers.add(observer);
		observer.setTrainee(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.onlineObservers.remove(observer);
		observer.setTrainee(null);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer viewer : this.onlineObservers) {
			
		}
	}

	@Override
	public Boolean getUpdate() {
		// TODO Auto-generated method stub
		return null;
	}
}
