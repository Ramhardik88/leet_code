package dialyproblems;

import java.util.Scanner;
/* time =o(n) space =o(1)*/

public class SingleNumber {
	public static int solution(int[] arr) {
		
		int result=0;
		for(int num:arr) {
			result^=num;
		}
		
		return result;
		
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
		// non repeated number 
		System.out.println(result);
		

	}

}
