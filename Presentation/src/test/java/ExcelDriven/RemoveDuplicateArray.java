package ExcelDriven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray 
{

	    public static void main(String[] args) 
	    {
	        int[] num = {1,1,2,2,2,3,4,4,5};

	        Set<Integer> set  = new LinkedHashSet<Integer>();
	        for(int n: num)
	        {
	        	set.add(n);
	        }
	        System.out.println(set);
	    
	    }
	}

	
	


	


