import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class GetFile {
	private String filename;
	private String output; 
	private int fileArrayLength = output.split("\n").length;
	private String[] fileArray = new String[fileArrayLength];
	private String[][] fileSpaceArray = new String[fileArrayLength][3]; 
	private int[][] intIntArray = new int[fileArrayLength][3]; // nested array by line
	
	public GetFile(String filename){
		this.filename = filename;
	}
	
	public String[] splitLineInFileArray() {
		fileArray = output.split("\n");
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

	

	
	public void sortIntIntArray(){
		for (int i = 0; i < intIntArray.length; i++){
			Arrays.sort(intIntArray[i]);
		}
	}
	

	public String parseFile(){
		Charset charset = Charset.forName("US-ASCII");
		Path p = Paths.get(filename);
		
		try (BufferedReader reader = Files.newBufferedReader(p, charset)) {
			String line = "";
			while((line = reader.readLine()) != null) {
				output = output + line + "\n";
			}
		} catch (IOException x) {
				System.err.format("IOxception: %s%n", x);
			}
		output = output.replace("null", "");
		return output;
	}
	
	public int[][] getIntIntArray() {
		parseFile();
		splitLineInFileArray();
		splitSpaceInFileArray();
		convertToIntArray();
		sortIntIntArray();
		return intIntArray; 
	}

}
