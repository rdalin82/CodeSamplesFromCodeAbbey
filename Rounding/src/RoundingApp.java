
public class RoundingApp {
	public static void main(String[] args) {
		int[] arr1 = {
				-1820393, -9470398, 4327, 5909, 7061265, 16123, -1322721, 16137, 9773, 9398817, 10285, 19205, 15421, 14273, 8066852
		};
		int[] arr2 = {
				1968314, -3025545, 614, 550, 602, 1396, 1703387, 1052, 980, 4016157, 896, 938, 972, 1162, 151	
		};
		
		
		Rounder r = new Rounder(arr1, arr2);
		double x = -0.645619;
		System.out.println(r.result());
		System.out.println((int)Math.round(x));

	}

}
