package remote_control;

public class RemoteLoader {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWitchCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWitchCD, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtenWasPushed(0);
		remoteControl.offButtenWasPushed(0);
		remoteControl.onButtenWasPushed(1);
		remoteControl.offButtenWasPushed(1);
		remoteControl.onButtenWasPushed(2);
		remoteControl.offButtenWasPushed(2);
		remoteControl.onButtenWasPushed(3);
		remoteControl.offButtenWasPushed(3);
	}

}
