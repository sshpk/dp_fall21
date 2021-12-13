package pk.cuiatd.dp.tm;

abstract public class DataParser {
	//Template method
	public final void parseDataAndGenerateOutput(){
		readData();
		processData();
		writeData();
	}
	//These methods will be implemented by its subclass
	abstract void readData();
	abstract void processData();

	/** We have to write output in a CSV file 
    this step will be same for all subclasses */
	public final void writeData(){
		System.out.println("Output generated, writing to CSV");
	}
}