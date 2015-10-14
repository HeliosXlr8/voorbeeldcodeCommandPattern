package remote_control;

public class StereoOffCommand implements Command {
	Stereo stereo;
	
	public StereoOffCommand(Stereo Stereo) {
		this.stereo = Stereo;
	}
	
	public void execute() {
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
}
