
public class DiceRollApp {
	public static void main(String[] args) {
		DiceRoll dr = new DiceRoll("./test.txt");
		System.out.println(dr.getResult());
	}
}
