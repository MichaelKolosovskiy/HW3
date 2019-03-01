package cardetails;

public class HomeworkApp {
 
	public static void main(String[] args) {
		CarDoor car = new CarDoor(true,true);
		car.closeDoor();
		car.closeWindow();
		System.out.println(car.toString());
		System.out.println();
		
		CarWheel  w = new CarWheel();
		w.tireWear(0.5);
		w.changeCarWheelOrNot();
		System.out.println();
		 
		Car car1 = new Car("Fuel",300,100,4,2,123,2019);
		System.out.println(car1.toString());
		System.out.println();
		car1.addOnePassenger();
		car1.onePassengerOff();
		car1.changeCurrentSpeed(130);
		car1.getOffAllPassengers();
		System.out.println(car1.toString());
	}

}
