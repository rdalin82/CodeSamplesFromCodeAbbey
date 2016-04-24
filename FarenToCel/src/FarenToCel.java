
public class FarenToCel {
	private int[] inputs;
	private int length; 
	private int sub = 32;
	private double top = 5.0;
	private int bottom = 9;
	
	public FarenToCel(int[] inputs){
		this.inputs = inputs;
		this.length = inputs.length;
	}
	public String result(){
		String result = new String();
		for (int i = 0; i < length; i++) {
			double calculation = (inputs[i]-sub)*top/bottom; 
			result = result + round(calculation)+ " ";
		
		}
		result = result.trim();
		return result; 
	}
	
	public int round(double x) {
		int temp; 
		temp = (int)Math.round(x);
		return temp;
	}
}
