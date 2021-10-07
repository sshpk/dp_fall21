package pk.cuiatd.dp.proxy;

public class ProxyImage implements Image{
	RealImage image;
	public ProxyImage(String fileName) {
		image = new RealImage(fileName);
	}
	public String getFileName() {
		System.out.println("****Logging the getFileName method****");
		return image.getFileName();
	}
	@Override
	public void display() {
		System.out.println("****Logging the display method****");
		image.display();
	}
}
