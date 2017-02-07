package two;

import java.util.Comparator;

public class SortedByNameDesc implements Comparator<Dog>
	{
	    public int compare(Dog obj1, Dog obj2)
	    {
	        String str1 = obj1.getName();
	        String str2 = obj2.getName();
	            
	        return str2.compareTo(str1);
	    }
	}


