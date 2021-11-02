package pk.cuiatd.dp.cmd;

public class UnixFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("File is opened in Unix OS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed in Unix OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("File is written in Unix OS");
		
	}

}
