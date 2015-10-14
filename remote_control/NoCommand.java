package remote_control;

public class NoCommand implements Command {

	public void execute() {
		System.out.println("Unbound button");
	}
	
	public void undo() {
		System.out.println("Last action was unbound");
	}
	
}
