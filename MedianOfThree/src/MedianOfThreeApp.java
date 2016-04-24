
public class MedianOfThreeApp {
	public static void main(String[] args) {
		GetFile f = new GetFile("./test.txt");
		f.parseFile();
		MedianOfThree t = new MedianOfThree();
		System.out.println(t.result());
	}
}
