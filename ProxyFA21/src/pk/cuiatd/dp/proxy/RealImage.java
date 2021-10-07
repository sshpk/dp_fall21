package pk.cuiatd.dp.proxy;

public class RealImage implements Image{
	private String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void display() {
		loadFromDisk();
		System.out.println("Displaying the file: "+fileName);

	}
	public void loadFromDisk(){
		System.out.println("Loading the file: "+fileName+" from disk");
	}
	@Override
	public String getFileName() {
		return fileName;
	}
}
