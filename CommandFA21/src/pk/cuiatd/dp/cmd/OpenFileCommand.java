package pk.cuiatd.dp.cmd;

public class OpenFileCommand implements Command{
	FileSystemReciever receiver;
	
	public OpenFileCommand(FileSystemReciever receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.openFile();
		
	}
	@Override
	public void undo() {
		receiver.closeFile();
		
	}
	
}
