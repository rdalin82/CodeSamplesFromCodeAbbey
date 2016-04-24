import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class VowelCounter {
	private String input; 
	private String[] fileArray = {};
	private String[] lineArray = {};
	private String filename;
	
	public VowelCounter(String filename){
		this.filename = filename;
	}

	public String parseFile(){
		Charset charset = Charset.forName("US-ASCII");
		Path p = Paths.get(filename);
		
		try (BufferedReader reader = Files.newBufferedReader(p, charset)) {
			String line = "";
			while((line = reader.readLine()) != null) {
				input = input + line + "\n";
			}
		} catch (IOException x) {
				System.err.format("IOxception: %s%n", x);
			}
		input = input.replace("null", "");
		return input;
	}
	
	public String[] splitInput(){
		try {
			fileArray = input.split("\n");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return fileArray;
	}
	
	public String[] splitArray(String str){
		String[] array = {};
		try {
			array = str.split("");
		} catch(Exception e) {
			e.printStackTrace();
		}
		lineArray = array;
		return lineArray;
	}
	
	public String count() {
		String result = new String("");
		String pattern = "[aeiouy]";
		parseFile();
		splitInput();
		splitArray(fileArray[0]);
		for (int i = 0; i < fileArray.length; i++ ){
			int count = 0;
			lineArray = splitArray(fileArray[i]);
		
			for (int y = 0; y < lineArray.length-1; y++) {
				String str = Character.toString(fileArray[i].charAt(y)); 
				if (str.matches(pattern)) {
					
					count = count + 1 ;
				}
			}
			result = result + count + " ";
		}
		result = result.trim();
		return result;
	}
}
