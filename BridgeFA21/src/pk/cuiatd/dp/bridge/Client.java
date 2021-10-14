package pk.cuiatd.dp.bridge;

import pk.cuiatd.dp.bridge.abstraction.Remote;
import pk.cuiatd.dp.bridge.implementation.Device;
import pk.cuiatd.dp.bridge.implementation.Radio;
import pk.cuiatd.dp.bridge.implementation.TV;

public class Client {

	public static void main(String[] args) {
		Device device = new Radio();
		Remote remote = new Remote(device);
		
		remote.togglePower();
		
		remote.channelUp();
		//remote.channelDown();
		//remote.channelDown();
		
		//remote.volumeUp();
		remote.volumeDown();

	}

}
