package object.abstraction;

abstract class Vehicle{
	abstract void speed();
	abstract void mileage();
	void wheel() {
		System.out.println("It has 4 Wheels");
	}
}

class Bmw extends Vehicle{
	void speed() {
		System.out.println("BMW speed is 100km/h");
	}
	void mileage() {
		System.out.println("BMW mileage is 22km");
	}
}

public class Prasasti  {
	public static void main(String[] args) {
		Bmw b1 = new Bmw();
		b1.speed();
		b1.mileage();
		b1.wheel();
	}
}

