package pk.cuiatd.dp.cmd;

public class WindowsFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("File is opened in Windows OS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed in Windows OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("File is written in Windows OS");
		
	}

}
