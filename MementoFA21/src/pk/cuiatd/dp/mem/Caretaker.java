package pk.cuiatd.dp.mem;

public class Caretaker {
private Object snapshot;
	
	public void save(Editor editor){
		this.snapshot = editor.save();
	}
	public void undo(Editor editor){
		editor.restore(snapshot);
	}
}
