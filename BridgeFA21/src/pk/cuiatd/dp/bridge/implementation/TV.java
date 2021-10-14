package pk.cuiatd.dp.bridge.implementation;

public class TV implements Device{

	boolean enabled = false;
	int volume = 20;
	int channel = 20;
	@Override
	public void enable() {
		enabled = true;
	}
	@Override
	public void disable() {
		enabled = false;
	}
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	@Override
	public int getVolume() {
		return volume;
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		if((this.volume <0)||(this.volume > 100))
			this.volume = 20;
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		if((this.channel <1)||(this.channel > 20))
			this.channel = 1;
	}

}
