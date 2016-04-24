
public class MinOfTwo {
	private int[] one;
	private int[] two;
	private int length;
	
	public MinOfTwo(int[] one, int[] two){
		this.one = one;
		this.two = two;
		this.length = one.length;

	}
	
	public String result(){
		String s = new String("");
		for (int i = 0; i < length; i++) {
			if (one[i]<= two[i]){
				s = s + one[i] + " ";
			} else {
				s = s + two[i] + " "; 
			}
		}
		s = s.trim();
		return s;
	}

}
