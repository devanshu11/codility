package practiceQues;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ques1 {

	public static void main(String[] args) {
		Ques1 obj1 = new Ques1();
		Integer N =20;
		System.out.println(obj1.solution(N));

	}
    public int solution(int N) {
    	String bin = Long.toBinaryString(N);
    	String[] lis = bin.split("");
    	List<String> lis2 =new ArrayList<String>();
    	lis2=Arrays.asList(lis);
    	List<String> lis1 =new ArrayList<String>(lis2);
    	lis1.add("k");
    	System.out.println(lis1);
    	Integer zeroCount = 0;
    	Integer oneCounter = 0;
    	List<Integer> zero = new LinkedList<Integer>();
    	for(String val:lis1) {
    		System.out.println("val= " + val);
    		if(oneCounter==2 ){
    			zero.add(zeroCount);
    			System.out.println(zero);
    			if(!"k".equals(val)){
        			oneCounter=1;
        			zeroCount=0;
    			}

    			
    		}
    	
    		if("1".equals(val) && oneCounter!= 2 )
    		{
    			oneCounter+=1;
    			System.out.println("one c =  " +oneCounter);
    			System.out.println("zero c =  " +zeroCount);
    		}
    		else if("0".equals(val) && oneCounter!=2) {
    			zeroCount+=1;
    			System.out.println("one c =  " +oneCounter);
    			System.out.println("zero c =  " +zeroCount);
      		}

    		
    	}
    	System.out.println(zero);
   	
    	
    	System.out.println(bin);
    	System.out.println( "injkk"+oneCounter);
    	if(oneCounter!=2 && zero.size()<1) {
    		return 0;
    	}
    	Integer max = Collections.max(zero);
		return max;
    	
        // write your code in Java SE 8
    }

}
