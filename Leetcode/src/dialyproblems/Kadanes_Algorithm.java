package dialyproblems;

public class Kadanes_Algorithm {

	public static int solution(int[] a) {
		int max_sum = a[0];
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			if (sum < 0) {
				sum = a[i];
			} else {
				sum = sum + a[i];

			}
			max_sum = Math.max(max_sum, sum);

		}
		return max_sum;

	}

	public static void main(String[] args) {

		int[] a = { 1 };
		System.out.println(solution(a));

	}

}
