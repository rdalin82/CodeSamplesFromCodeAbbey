
public class DiceRoll {
	private double[] input; 
	private int[] rolls;
	private String result="";
	
	public DiceRoll(String filename){
		GetFile gf = new GetFile(filename);
		this.input = gf.getDoubleArray();
		this.rolls = new int[input.length];
	}
	public int[] calculateRolls(){
		for (int i = 0; i < input.length; i++) {
			rolls[i] = (int) Math.round((Math.floor(6.0*input[i]))+1);
		}
		return rolls;
	}
	
	public String getResult(){
		calculateRolls();
		for (int i = 0; i < rolls.length; i++) {
			result = result + String.valueOf(rolls[i]) + " ";
		}
		result = result.trim();
		return result;
	}
}
