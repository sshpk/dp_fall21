package pk.cuiatd.dp.cmd;

public class WriteFileCommand implements Command{
	FileSystemReciever receiver;
	
	public WriteFileCommand(FileSystemReciever receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.writeFile();
		
	}
	@Override
	public void undo() {
		receiver.writeFile();
		
	}
	
}
