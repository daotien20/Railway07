package entity;

public class Car {
	private String name;
	private String type;
	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Car() {
		super();
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public class Engine {
		private String engineType;

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		
		
	}
	
}
