package remote_control;

public class CeilingFan {
	private String name;
	
	public CeilingFan() {
		this.name = "CeilingFan";
	}
	
	public CeilingFan(String name) {
		this.name = "CeilingFan " + name;
	}
		
	
	public void high() {
		System.out.println(name + " fan is on high");
	}
	public void low() {
		System.out.println(name + " fan is on low");
	}
	public void off() {
		System.out.println(name + " fan is off");
	}
}
