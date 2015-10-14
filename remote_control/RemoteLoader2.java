package remote_control;

public class RemoteLoader2 {

	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
				
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, garageDoorOpen, garageDoorClose);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtenWasPushed(0);
		remoteControl.offButtenWasPushed(0);
		remoteControl.onButtenWasPushed(1);
		remoteControl.offButtenWasPushed(1);
		remoteControl.undoButtonWasPushed();
	}

}
