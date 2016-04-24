import java.util.Arrays;
public class MedianOfThree {
	private GetFile f = new GetFile("./test.txt");
	private String file = f.parseFile();
	private int fileArrayLength = file.split("\n").length;
	private String[] fileArray = new String[fileArrayLength];
	private String[][] fileSpaceArray = new String[fileArrayLength][3]; 
	private int[][] intIntArray = new int[fileArrayLength][3]; // nested array by line
	private String result ="";
	
	public String[] splitLineInFileArray() {
		fileArray = file.split("\n");
		return fileArray;
	}
	public String[][] splitSpaceInFileArray(){
		for (int i = 0; i < fileArray.length; i++) {
			fileSpaceArray[i] = fileArray[i].split(" ");
		}
		return fileSpaceArray;
	}
	public int[][] convertToIntArray() {
		for (int i = 0; i < fileSpaceArray.length; i++) { 
			for (int y = 0; y < fileSpaceArray[i].length; y++){
				intIntArray[i][y] = Integer.parseInt(fileSpaceArray[i][y]);
			}
		}
		return intIntArray; 
	}

	
	public int[][] getIntIntArray(){
		return intIntArray;
	}
	
	public void sortIntIntArray(){
		for (int i = 0; i < intIntArray.length; i++){
			Arrays.sort(intIntArray[i]);
		}
	}
	public String result() {
		splitLineInFileArray();
		splitSpaceInFileArray();
		convertToIntArray();
		sortIntIntArray();
		for (int i = 0; i < intIntArray.length; i++) {
			String tempString = String.valueOf(intIntArray[i][1]);
			result = result + tempString + " ";
		}
		result = result.trim();
		return result;
	}
}
