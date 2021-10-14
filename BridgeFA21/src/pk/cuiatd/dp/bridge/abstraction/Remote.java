package pk.cuiatd.dp.bridge.abstraction;

import pk.cuiatd.dp.bridge.implementation.Device;

public class Remote {
	Device device;
	
	public Remote(Device device) {
		this.device = device;
	}
	public void togglePower(){
		System.out.println("Toggle Power called");
		if(device.isEnabled()){
			device.disable();
			System.out.println("device is disabled");
		}
			
		else{
			device.enable();
			System.out.println("device is enabled");
		}
	}
	public void volumeUp(){
		device.setVolume(device.getVolume()+10);
		System.out.println("new volume is: "+device.getVolume());
	}
	public void volumeDown(){
		device.setVolume(device.getVolume()-10);
		System.out.println("new volume is: "+device.getVolume());
	}
	public void channelUp(){
		device.setChannel(device.getChannel()+1);
		System.out.println("new channel is: "+device.getChannel());
	}
	public void channelDown(){
		device.setChannel(device.getChannel()-1);
		System.out.println("new channel is: "+device.getChannel());
	}
	
}
