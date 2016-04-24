
public class SumOfDigits {
	private String filename;
	private int[][] input;
	private int[] sums;
	private char[][] charArray;
	private int[][] intIntArray;
	private int[] resultArray;
	private String result="";
	
	public SumOfDigits(String filename){
		this.filename = filename;
		GetFile file = new GetFile(filename);
		this.input = file.getIntIntArray();
	}
	public void print(){
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i][0]);
		}
	}
	public int[] getSums(){
		int temp;
		sums = new int[input.length];
		for (int i=0;i<input.length;i++){
			temp = (input[i][0]*input[i][1])+input[i][2];
			
			sums[i] = temp;
		}
		return sums;
	}
	
	public char[][] getStringArray(){
		charArray = new char[input.length][];
		for (int i = 0; i < input.length;i++) {
			char[] temp = String.valueOf(sums[i]).toCharArray();
			charArray[i] = temp;
		}
		for (int y=0;y<charArray.length;y++){
			intIntArray = new int[charArray.length][5];
			for (int k=0;k<charArray[y].length;k++){
				int num = Integer.valueOf(String.valueOf(charArray[y][k]));
				intIntArray[y][k] = num;
			}
		}
		return charArray;
	}
	
	public int[][] getIntIntArray(){
		return intIntArray;
		
	}
	public int getResultFromArray(int index){
		int value =0;
		for (int i=0;i<charArray[index].length;i++){
			int num = Character.getNumericValue(charArray[index][i]);
			
			value = value + num;	
		}
		return value;
	}
	
	public String getResult(){
		resultArray = new int[charArray.length];
		for (int i=0; i< charArray.length;i++){
			
			resultArray[i]=getResultFromArray(i);
			
		}
		for (int y = 0; y < resultArray.length; y++){
			
			result = result + resultArray[y] + " ";
		}
		
		result = result.trim();
		return result;
	}
	
}
