package backend;

import entity.Car;
import entity.Car.Engine;

public class BeCar {
	public void infoCar() {
		Car car = new Car();
		car.setName("Mazda");
		car.setType("8WD");
		System.out.println("name = " + car.getName());
		System.out.println("type = " + car.getType());
		Car.Engine engine = car.new Engine();
		engine.setEngineType("Crysler");
		System.out.println("loại động cơ: " + engine.getEngineType() );
		
	}
}
