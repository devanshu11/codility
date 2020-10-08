
package practiceQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques6 obj1 = new ques6();
		int[] arr = {1,3,4,5,6,-1,-2,-3}; 
		int ar= obj1.solution(arr);
		System.out.println(ar);

	}
    public int solution(int[] A) {
        // write your code in Java SE 8
    	 List<Integer> lis = new ArrayList<Integer>();
    	 Collections.sort(lis);
    	 Integer flag=1;
    	 for(int x:A) {
    		 lis.add(Integer.valueOf(x));
    	 }
    	if(!lis.contains(1)) return 1;
    	else 
    	{
    		for(Integer y : lis)
    		{
    			if(y>0 && !lis.contains(flag))
    			{
    				return flag;
    			}
    			else if(y<0)
				{
						flag=1;
				}
    			else 
    			{
    				flag+=1;
    			}
    		}
    		
    	}
    	return flag;
    }

}

