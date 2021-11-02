package pk.cuiatd.dp.cmd;

public class FileInvoker {
	//implement stack
	Command command;
	public FileInvoker(Command command) {
		this.command = command;
	}
	public void executeCommand(){
		command.execute();
	}
	public void undoCommand(){
		command.undo();
	}
}
