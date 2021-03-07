package backend;

import entity.CPU;

public class BeCPU {
	public void BeProcessor() {
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		System.out.println(processor.getCache());
		
	}
	
	public void BeRam() {
		CPU cpu = new CPU();
		CPU.Ram ram = cpu.new Ram();
		System.out.println(ram.getClockSpeed());
		
	}
}
