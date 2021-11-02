package pk.cuiatd.dp.cmd;

public class CloseFileCommand implements Command{
	FileSystemReciever receiver;
	
	public CloseFileCommand(FileSystemReciever receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.closeFile();
		
	}
	@Override
	public void undo() {
		receiver.openFile();
		
	}
	
	
}