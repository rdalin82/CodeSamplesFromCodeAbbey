
public class MinOfThree {
	private int[] arr1;
	private int[] arr2;
	private int[] arr3;
	private int length; 

	public MinOfThree(int[] arr1,int[] arr2,int[] arr3) {
		this.arr1 = arr1;
		this.arr2 = arr2;
		this.arr3 = arr3;
		this.length = arr1.length;
	}
	
	public String result(){
		String result = new String("");
		for (int i = 0; i < length; i++){
			if (arr1[i] <= arr2[i] && arr1[i] <= arr3[i]){
				result = result + arr1[i]+" ";
			} else if (arr2[i] <= arr1[i] && arr2[i] <= arr3[i]){
				result = result + arr2[i] + " ";
			} else {
				result = result + arr3[i] + " ";
			}
					
		}
		result = result.trim();
		return result;
	}
	
}
