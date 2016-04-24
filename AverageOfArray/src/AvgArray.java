
public class AvgArray {
	private double dub = 1.0;
	private String filename = "";
	private String input = "";
	private String[] inputArray;
	private String[][] arrayOfStrings;
	private int length; 
	private int[][] arrayOfInts;
	public String result ="";
	
	public AvgArray(String name){
		this.filename = name;
		GetFile gf = new GetFile(filename);
		this.input = gf.parseFile();
	
	}
	public void setup(){
		setInputArray();
		setArrayofStrings();
		setArrayofInts();
	}
	
	public String getInput(){
		return input;
	}
	
	private void setLength(int length){
		this.length = length;
	}
	
	public int getLength(){
		return length; 
	}
	public void setInputArray(){
		inputArray = input.split("\n");
		int length = Integer.valueOf(inputArray[0]);
		setLength(length);
	}
	public String[] getInputArray(){
		return inputArray;
	}
	public void setArrayofStrings(){
		String[][] tempArray = new String[length][];
		for (int i = 1; i < inputArray.length; i++) { 
			int minusOne = i-1;
			
			String[] temp = inputArray[i].split(" ");
			tempArray[minusOne] = temp;
		}	
		this.arrayOfStrings = tempArray;
	}
	public String[][] getArrayofStrings(){
		return arrayOfStrings;
	}
	
	public void setArrayofInts(){
		int[][] arrayOfInts = new int[length][12];
		
		for (int i = 0; i<arrayOfStrings.length; i++){
			int[] temp = new int[arrayOfStrings[i].length];
			for (int y=0; y<arrayOfStrings[i].length;y++){
				
				temp[y] = Integer.valueOf(arrayOfStrings[i][y]);
			}
			arrayOfInts[i] = temp;
		}		
		this.arrayOfInts = arrayOfInts;
	}
	public int[][] getArrayOfInts(){
		return arrayOfInts;
	}
	
	public int calculateAverage(int[] array){
		int average;
		double unroundedAverage;
		int total = 0;
		Rounder round = new Rounder();
		for (int i =0; i< array.length; i++){
			total = total + array[i];
		}
		unroundedAverage = (total*dub)/array.length;
		average = round.round(unroundedAverage);
		return average;
	}
	public String getResult(){
		for (int i = 0; i < length; i++){
			result = result + String.valueOf(calculateAverage(arrayOfInts[i])) + " ";
		}
		result = result.trim();
		return result;
	}
}
