package pk.cuiatd.dp.tm;

public class Demo {

	public static void main(String[] args) {
		CSVDataParser csvDataParser=new CSVDataParser();
		csvDataParser.parseDataAndGenerateOutput();

		System.out.println("**********************");

		DatabaseParser databaseParser=new DatabaseParser();
		databaseParser.parseDataAndGenerateOutput();

	}
}