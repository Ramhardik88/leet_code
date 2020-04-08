package dialyproblems;

import java.util.HashMap;
import java.util.Map;

public class N0_6_Two_sum {

	public static void main(String[] args) {
		int[] num= {2 ,1,7, 11, 15};
		int target=14;
		int[] result=solution(num,target);
		System.out.println(result[0]+" "+result[1]);

	}
	public static int[] solution(int[] num,int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			
			int count=target-num[i];
			if(map.containsKey(count)) {
				return new  int []  {i,map.get(count)};
				
			}
			map.put(num[i],i);
			
			
		}
		return new int[] {-1,-1};
		
		
	}

}
