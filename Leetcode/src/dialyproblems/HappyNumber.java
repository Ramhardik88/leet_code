package dialyproblems;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public static boolean isHappy(int n) {
		Set<Integer> numbercount=new HashSet<>();
		
		while(n!=1) {
			int current=n;
			int sum=0;
			
			while(current!=0) {
				int rem=current%10;
				sum=sum+(rem*rem);
			    current=current/10;
			   
			}
			if(numbercount.contains(sum)) {
				return false;
			}
			n=sum;
			numbercount.add(n);
			}
		return true;
	
	}

	public static void main(String[] args) {
		
		int num=30;
		System.out.print(isHappy(num));
		
		

	}

}
