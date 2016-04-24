
public class Rounder {
	private int[] arr1;
	private int[] arr2;
	private int length; 

	public Rounder(int[] arr1, int[]arr2){
		this.arr1 = arr1;
		this.arr2 = arr2;
		this.length = arr1.length;
	}
	public Rounder(){
	}
	
	public int round(double x) {
		int temp; 
		temp = (int)Math.round(x);
		return temp;
	}
	public String result(){
		String list = new String();
		for (int i = 0; i < length; i++ ) {
			int a = arr1[i];
			int b = arr2[i];
			double c =(double) a/b;
			int temp;
			temp = (int)Math.round(c);
			list = list + temp + " ";
		}
		list = list.trim();
		return list;
	}
}
