package dialyproblems;

public class Two_sum {

	public static void main(String[] args) {
		int num[]= {1,4,5,3,2,9,13};
		int target=22;
		System.out.println(solution(num,target));

	}
	public static int solution(int[] num,int target) {
		int n=num.length;
		int right=1,left=0;
		while(right<n) {
			if(num[right]+num[left]==target) {
				return num[right]+num[left];
				
			}
			else {
				if(num[right]+num[left]!=target) {
					for(int i=right;i<n;i++) {
						target=num[right]+num[left];
						++right;
					}
				}
			}
		}
		return target ;
	

}
}
