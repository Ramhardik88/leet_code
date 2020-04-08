package dialyproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber_one {
	public static int solution(int []arr) {
		Map<Integer,Integer> numCountmap=new HashMap<>();
		
		for(int i:arr) {
			numCountmap.put(i, numCountmap.getOrDefault(i,0)+1);
			
			
		}
		for(Map.Entry<Integer,Integer>entry : numCountmap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size");
		int size=scan.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
      int result=solution(arr);
      System.out.println(result);
	}

}
