package pk.cuiatd.dp.mem;


public class Demo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();

		Editor textEditor = new Editor("data.txt");
		textEditor.write("this is the first line\n");
		
		textEditor.write("this is the second line\n");
		
		System.out.println("before saving: \n"+textEditor);
		
		caretaker.save(textEditor);
		textEditor.write("this is the third line\n");
		System.out.println("after saving: \n"+textEditor);
		
		caretaker.undo(textEditor);
		
		System.out.println("after undo: \n"+textEditor);
		

	}

}
