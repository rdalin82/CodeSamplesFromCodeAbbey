
public class AddTwoArrays {
	public static void main(String[] args){
		int[] l1 = {
				695153, 
				322835, 
				723579, 
				818087, 
				44524, 
				582817, 
				558806, 
				994189, 
				75292, 
				20343, 
				907582, 
				497726, 
				861611
		};
		int[] l2 = {
				846635,
				503639,
				297460,
				247933,
				391477,
				52673,
				211697,
				731433,
				511994,
				41271,
				252650,
				612030,
				793129
		};
		AddTwo a = new AddTwo(l1, l2);
		int[] result = a.addArrays();
		for (int i=0; i<l1.length; i++){
			System.out.print(result[i]+" ");
		}	
		System.out.println();
		System.out.println(a.getPrettyResult());
		
	}
}
