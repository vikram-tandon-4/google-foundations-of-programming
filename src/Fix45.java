
/*
 * (This is a slightly harder version of the fix34 problem.)
 *  Return an array that contains exactly the same numbers as the given array,
 *   but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's,
 *    but every other number may move. The array contains the same number of 4's and 5's,
 *     and every 4 has a number after it that is not a 4. In this version,
 *      5's may appear anywhere in the original array.


fix45([5, 4, 9, 4, 9, 5]) => [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) => [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) => [1, 4, 5, 1, 1, 4, 5]
 */

import java.util.ArrayList;

public class Fix45 {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 5, 4, 1 };
		int[] nums45 = fix45(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums45[i] + " ");
		}
	}

	public static int[] fix45(int[] nums) {

		ArrayList<Integer> fivePosition = new ArrayList<Integer>();
		int currentFive = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 5) {
				fivePosition.add(i);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				if (nums[i + 1] == nums[fivePosition.get(currentFive)]) {
					fivePosition.remove(Integer.valueOf(i + 1));
				} else {
					int temp = nums[i + 1];
					nums[i + 1] = nums[fivePosition.get(currentFive)];
					nums[fivePosition.get(currentFive)] = temp;
					currentFive++;
				}
			}
		}
		return nums;
	}
}
