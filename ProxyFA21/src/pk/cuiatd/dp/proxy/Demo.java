package pk.cuiatd.dp.proxy;

public class Demo {

	public static void main(String[] args) {
		
		ProxyImage image;
		image = new ProxyImage("Profile_Picture.png");
		System.out.println(image.getFileName());
		
		image.display();
	}

}
