package pk.cuiatd.dp.bridge.implementation;

public interface Device {
	void enable();
	void disable();
	boolean isEnabled();
	int getVolume();
	void setVolume(int volume);
	int getChannel();
	void setChannel(int channel);
	
}
