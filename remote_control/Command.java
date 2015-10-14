package remote_control;

public interface Command {
	public void execute();
	public void undo();
}
