package test;

public class NestedClassExample {
	Car mycar = new Car();
	
	Car.Tire tire = mycar.new Tire();
	
	Car.Engine engine = new Car.Engine();
}
