package remote_control;

public class GarageDoor {
	private String name;
	
	public GarageDoor() {
		this.name = "Garagedoor";
	}
	
	public GarageDoor(String name) {
		this.name = "Garagedoor " + name;
	}
	
	public void up() {
		System.out.println(name + " goes up");
	}
	public void down() {
		System.out.println(name + " goes down");
	}
	public void stop() {
		System.out.println(name + " stops!");
	}
	public void lightOn() {
		System.out.println(name + " light is on");
	}
	public void lightOff() {
		System.out.println(name + " light is off");
	}
}
