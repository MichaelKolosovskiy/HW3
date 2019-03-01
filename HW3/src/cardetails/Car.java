package cardetails;

public class Car {

	private final int year;
	private String engineType;
	private int maxSpeed;
	private int acceleration;
	private int passengers;
	private int passengersIn;
	private int currentSpeed;
	int[] arrayOfWheels; 
	int[] arrayOfDoors; 
	
	public Car(int year) {
		this.year = year;
	}
	
	public Car(String engineType,int maxSpeed,int acceleration,int passengers,int passengersIn,int currentSpeed, int year) {
		this(year);
		this.engineType = engineType;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.passengersIn = passengersIn;
		this.passengers = passengers;
		this.currentSpeed = currentSpeed;
		
	} 
	
	private void emptyCar() {
		this.passengersIn = 0;
		this.currentSpeed = 0;
	}
	
	public void addOnePassenger() {
		if((this.passengersIn >= 0 || this.passengersIn <= 0)&& this.passengersIn < this.passengers){
			this.passengersIn += 1;
				if(this.passengersIn <= 0) {
					emptyCar();
				}
			}
		}

	public void changeCurrentSpeed(int currentSpeed) {
		if(this.passengersIn >= 1) {
		this.currentSpeed = currentSpeed;
		}else {
			if(this.passengersIn == 0) {
			emptyCar();
			}
		}
	}
	
	public void onePassengerOff() {
		this.passengersIn --;
		if(this.passengersIn == 0) {
		 emptyCar();
		}
	}
	 
	public void getOffAllPassengers() {
			this.passengersIn = 0;
			emptyCar();
	}
	
	@Override
    public String toString() {
        return
                "Year : " + this.year
                        + "\nEngine: " + this.engineType
                        + "\nSpeed: " + this.maxSpeed
                        + "\nAcceleration: " + this.acceleration
                        + "\nPassenger: " + this.passengers
                        + "\nPassenger in the car: " + this.passengersIn
                        + "\nCurrent speed: " + this.currentSpeed;
    }

}
