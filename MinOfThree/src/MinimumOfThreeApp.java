
public class MinimumOfThreeApp {
	public static void main(String[] args) {
		int[] arr1 = {
				3771568, -2204279, -6453536, -3148103, 7140639, -4263295, 9793721, -8685634, -3617624, 333838, -931421, -7474697, 67226, 2115643, 3823097, 2012476, 6110441, -2285759, -2005552, 6824718, 2073736, -4244057, 6196332, -2050892, 3961071, 4803314, 2909851, -6409828, -7950987, -1897403
		};
		int[] arr2 = {
				8433189, 6758181, -8687613, 4259188, 4830279, 7264294, 2573784, -2221480, -2405257, -7087252, 6684315, -5519963, -1973500, 4878397, 2019036, 7755740, 7549462, 8863827, -4753796, 5580041, -5351379, -2826076, 7241150, -643207, -6820110, 5192366, 1302808, 9017049, -2988502, -6163784
		};
		int[] arr3 = {
				3456724, -2458077, -7951583, -8292545, 8189379, -5902034, 1603800, -9719793, -1169730, 5249018, 3682207, 440389, 1752775, -3988036, -9157757, 8106536, 680321, 8458841, -3946416, -1033668, -4349353, 130683, 8157183, 3035580, -4945383, -7189643, -9640181, 9223646, -5530149, -9950107
		};
		MinOfThree min3 = new MinOfThree(arr1, arr2, arr3);
		System.out.println(min3.result());
		
	}
}