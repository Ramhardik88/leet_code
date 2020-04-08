package dialyproblems;
/*Given an integer array arr, count element x such that x + 1 is also in arr.

If there're duplicates in arr, count them seperately.

 

Example 1:

Input: arr = [1,2,3]
Output: 2
Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
Example 2:

Input: arr = [1,1,3,3,5,5,7,7]
Output: 0
Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
Example 3:

Input: arr = [1,3,2,3,5,0]
Output: 3
Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
Example 4:

Input: arr = [1,1,2,2]
Output: 2
Explanation: Two 1s are counted cause 2 is in arr.*/

import java.util.Arrays;

public class No_5_Counting_Elements {
	public static int solution(int num[]) {
		int count = 0, left = 0;
		int right = 1;

		int n = num.length;
		Arrays.sort(num);

		while (right < n) {
			if (num[right] == 1 + num[left]) {
				count += right - left;
				left = right;
				right += 1;
			} else if (num[right] == num[left]) {
				right += 1;

			} else {
				left = right;
				right += 1;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int num[] = { 1, 1, 2, 2 };
		System.out.println(solution(num));

	}

}
