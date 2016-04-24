
public class VowelCounterApp {
	public static void main(String[] args) {
		VowelCounter vc = new VowelCounter("./text.txt");
		System.out.println(vc.count());
	}
}
