
	public class MaxArrayApp {
	
		public static void main(String[] args) {
			int[] array = {
					-62572, 4428, 20858, 74217, 59737, 3107, 30562, 8783, 55519, 1515, 42050, -64019, 50759, -3038, -49032, 35488, -42151, -45681, -8612, 3536, 35341, 49019, -27910, -17582, 51204, 41481, 53112, 62550, -2742, 18740, -47456, 14685, -56832, 53401, 8902, -77094, -23491, -40535, 11688, -47971, 40980, -26261, -31991, 11739, 50701, -1024, -32772, -71450, 33295, 38616, 12086, -11364, 7635, 64175, 51054, -21161, 25657, 24167, -38611, -57084, -37093, -6067, 37600, -13925, -32665, -33497, -11020, 23843, 5968, -79331, 55871, -33052, -25592, -56119, 58687, -54891, 22856, -54085, -46342, -23848, 64530, 45744, 44787, -7834, 29919, 15842, 51004, -24423, -39991, -67606, -1508, 2915, 6327, -43907, 68989, 53661, 2595, -22030, -2496, -71436, -21362, -26624, -24488, 33045, -2744, -45801, 58154, -59887, -19886, -68187, -3736, -35355, 57556, -38948, 36810, 7475, 56893, 7814, 63052, -63097, 20208, -18456, 19818, -53465, 17636, 8807, -79803, -59768, 66777, -2300, -51205, -34584, 51076, 4306, 78461, -31667, 38505, 56615, -11555, -61381, 68427, 64708, -16737, 45983, -54239, -59927, -26541, -77346, 27887, -43489, -60443, -31904, 18054, 39374, -5370, -44309, -31818, -5174, -24078, -45041, 72526, 4717, 374, 43603, -70977, -1165, -68064, 47527, -24550, 380, 66145, -36122, -14911, -30591, -70139, 10849, -10519, -16681, 13503, -62631, 19830, 33059, -14536, -42116, -7566, 60094, -6426, 40615, -25080, 49496, 75573, -32553, -25787, -4052, -68950, -16764, 74782, -57014, -49237, -29767, 23365, -63091, 14110, -71545, -13683, 23970, 19303, 55798, -72710, -47193, 73166, 27119, 65866, -21370, 65003, -21700, -41276, -21422, -61084, 13644, -51926, -65511, 61091, 2287, 10436, 72141, 65522, 5219, -64873, -63714, 55451, 38492, -46805, -10439, 46946, 19512, -66468, -13750, -4690, -59178, 19057, -11523, 47941, 4923, 47107, 32944, 63223, -74168, -68477, -77861, 19475, -40403, -63372, 567, 41883, 27063, -7292, 27405, -47717, 7835, 43691, -72266, -33673, 76885, -2705, -66727, 16397, 10826, -477, -68292, 31648, -61420, 184, -411, 23503, -32709, -47466, 6727, -26878, -35944, 8865, 72597, 3652, 25492, -6836, -34465, -27444, 65872, 72940, 4838, -6293, 36631, 12572, 40033, 33517, -70133, 53306, -30086, 20693, -27170
			};
			
			MaxArray m = new MaxArray(array);
			System.out.println(m.getMax()+ " "+m.getMin());
		}
	}