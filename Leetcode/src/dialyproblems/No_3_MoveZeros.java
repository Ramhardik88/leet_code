package dialyproblems;

public class No_3_MoveZeros {
	public static void solution(int a[]) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				a[count++] = a[i];
			}

		}
		while (count < n) {
			a[count++] = 0;
		}
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+ " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 3, 12 };
		solution(a);

	}

}
