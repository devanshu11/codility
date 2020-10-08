package practiceQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ques2 {

	public static void main(String[] args) {
		ques2 obj1 = new ques2();
		Integer k = 1;
		int[] arr = {0,0,0}; 
		int[] ar= obj1.solution(arr,k);
		for(int x: ar) {
			System.out.println(x);
		}
		

	}
	public int[] solution(int[] A, int K) {
		List<Integer> lis = new ArrayList<Integer>();
		int len = A.length;
		int arr[]= new int[len];
		for(int val:A) {
			Integer hel= Integer.valueOf(val);
			lis.add(hel);
		}
		Collections.rotate(lis, K);
		System.out.println(lis);
		int c =0;
		for(Integer val :lis ) {
			int he = val.intValue();
			arr[c]=he;
			c+=1;
		}
		return arr ;
		
	}

}
