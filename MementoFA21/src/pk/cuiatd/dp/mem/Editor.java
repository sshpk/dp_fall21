package pk.cuiatd.dp.mem;


public class Editor {
	private String fileName;
	private StringBuilder content;

	public Editor(String file){
		this.fileName=file;
		this.content=new StringBuilder();
	}

	@Override
	public String toString(){
		return this.content.toString();
	}

	public void write(String str){
		content.append(str);
	}
	public Memento save(){
		return new Memento(this.fileName,this.content);
	}
	public void restore(Object obj){
		Memento recieved = (Memento)obj;
		this.fileName = recieved.fileName;
		this.content = recieved.content;
	}

	private class Memento{
		private String fileName;
		private StringBuilder content;

		public Memento(String file, StringBuilder content){
			this.fileName=file;
			this.content=new StringBuilder(content);
		}

	}
}
