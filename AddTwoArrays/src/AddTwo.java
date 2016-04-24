
public class AddTwo {
	private int[] one;
	private int[] two;
	private int[] result;
	
	public AddTwo(int[] one, int[] two){
		this.one = one;
		this.two = two;
		this.result = new int[one.length]; 
		
	}
	public int[] addArrays(){
		for (int i = 0; i < one.length; i++){
			result[i] = result[i] + one[i] + two[i];
		}
		return result; 
	}
	public int getLength(){
		return one.length;
	}
	public String getPrettyResult(){
		int[] arr = new int[one.length];
		if (result[0] != 0){
			arr = result;
		} else {
			arr = addArrays();
		}
		String s = new String(""); 
		for (int i=0; i < arr.length; i++){
			s = s + arr[i]+ " ";
		}
		return s;
	}
}
