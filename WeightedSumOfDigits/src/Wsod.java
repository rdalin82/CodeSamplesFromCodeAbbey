
public class Wsod {
	private int length;
	private String input;
	private String[] inputArray;
	private String result;

	public Wsod(String filename){
		GetFile gf = new GetFile(filename);
		this.input = gf.parseFile();
		this.inputArray = input.split("\n");
		this.length = Integer.valueOf(inputArray[0]);
	}
	
	public int getLength(){
		return length;
	}
	public String getInput(){
		return input;
	}
	
	public String[] getInputArray(){
		return inputArray;
	}
	
	public int calculate(int index){
		int num;
		String nums = String.valueOf(inputArray[1]);
		String[] list = nums.split(" ");
		char[] target = list[index].toCharArray();
		num = 0;
		for (int i=0;i<target.length;i++){
			String empty="";
			int value = Integer.parseInt(empty+target[i]);
			num = num + value*(i+1);
		}
		return num;
	}
	
	public String getResult() {
		result = "";
		String nums = String.valueOf(inputArray[1]);
		String[] list = nums.split(" ");
		
		for (int i=0;i<list.length;i++){
			result = result + calculate(i)+ " ";
		}
		result = result.trim();
		return result;
	}
}
