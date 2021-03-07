package entity;

public class CPU {
	private double price;
	private Processor processor;
	private Ram ram;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CPU(double price) {
		super();
		this.price = price;
	}

	public CPU() {
		super();
	}

	public class Processor {
		private short coreAmount;
		private String menufacturer;
		
		public short getCoreAmount() {
			return coreAmount;
		}

		public String getMenufacturer() {
			return menufacturer;
		}

		public void setCoreAmount(short coreAmount) {
			this.coreAmount = coreAmount;
		}

		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}

		public float getCache() {
			return 4.3f;
		}
	}
	
	public class Ram {
		private int memory;
		private String menufacturer;
		
		public float getClockSpeed() {
			return 5.5f;
		}

		public int getMemory() {
			return memory;
		}

		public String getMenufacturer() {
			return menufacturer;
		}

		public void setMemory(int memory) {
			this.memory = memory;
		}

		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}
		
	}
}
