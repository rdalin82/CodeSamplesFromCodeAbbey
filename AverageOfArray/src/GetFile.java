import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GetFile {
	private String filename;
	private String output="";
	
	public GetFile(String filename){
		this.filename = filename;
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
		output = output.replace(" 0", "");
		return output;
	}

}
