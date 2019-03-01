package cardetails;

public class CarWheel {
	
	private double amountOfTheWheel;
	
	public CarWheel() {
		this.amountOfTheWheel = 1;
	}
	 
	public CarWheel(double amountOfTheWheel) {
		this.amountOfTheWheel = amountOfTheWheel;
	}

	public void tireWear(double persent) {
		this.amountOfTheWheel = amountOfTheWheel - persent;
	}
	
	public void changeCarWheelOrNot() {
		if(this.amountOfTheWheel >= 0 && this.amountOfTheWheel <= 0.30) {
			System.out.println("You need to change your wheels");
		}else {
			System.out.println("You don't need to change your wheels");
		}
	}
}
