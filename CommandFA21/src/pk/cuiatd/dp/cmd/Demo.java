package pk.cuiatd.dp.cmd;

public class Demo {

	public static void main(String[] args) {
		FileSystemReciever receiver;
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("windows")){
			receiver = new WindowsFileSystemReciever();
		}
		else{
			receiver = new UnixFileSystemReciever();
		}
		Command openFileCommand = new OpenFileCommand(receiver);
		FileInvoker invoker = new FileInvoker(openFileCommand);
		invoker.executeCommand();
		
		System.out.println("undoing....");
		invoker.undoCommand();

	}

}
