
public class AvgArrayApp {
	public static void main(String[] args) {
		AvgArray avg = new AvgArray("./example.txt");
		avg.setInputArray();
		avg.setArrayofStrings();
		avg.setArrayofInts();
		System.out.println(avg.getResult());

	}	
}
