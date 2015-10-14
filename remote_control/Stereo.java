package remote_control;

public class Stereo {
	private String name;
	
	public Stereo() {
		this.name = "Stereo";
	}
	
	public Stereo(String name) {
		this.name = "Stereo " + name;
	}
	
	public void on() {
		System.out.println(name + " is on");
	}
	
	public void off() {
		System.out.println(name + " is off");
	}
	
	public void setCd() {
		System.out.println(name + " cd is set");
	}
	
	public void setDvd() {
		System.out.println(name + " dvd is set");
	}
	
	public void setRadio() {
		System.out.println(name + " radio is set");
	}
	
	public void setVolume(int volume) {
		System.out.println(name + " volume is set to " + volume);
	}
}
