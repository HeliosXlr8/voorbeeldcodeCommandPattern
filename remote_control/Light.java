package remote_control;

public class Light {
	
	private String name;
	
	public Light() {
		this.name = "Light";
	}
	
	public Light(String name) {
		this.name = "Light " + name;
	}

	public void on() {
		System.out.println(name + " is on");
	}
	
	public void off() {
		System.out.println(name + " is off");
	}
	
}
