
public class MaxArray {
	private int[] array;
	private int currentMax; 
	private int currentMin;
	private int length; 
	
	public MaxArray(int[] array) {
		this.array = array;
		this.currentMax = array[0];
		this.currentMin = array[0];
		this.length = array.length;
	}
	
	public int getMax(){
		for (int i = 0; i < length; i++){
			if (currentMax < array[i]){
				currentMax = array[i]; 
			}
		}
		return currentMax; 
	}
	public int getMin() {
		for (int i = 0; i < length; i++) {
			if (currentMin > array[i]){
				currentMin = array[i]; 
			}
		}
		return currentMin;
	}

}
