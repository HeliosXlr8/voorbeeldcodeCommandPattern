package remote_control;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo Stereo) {
		this.stereo = Stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
	
	public void undo() {
		stereo.off();
	}
	
	
}
