package two;

import java.util.Comparator;

public class SortedByAgeDesc implements Comparator<Dog>
	{
	    public int compare(Dog obj1, Dog obj2)
	    {
	       int age1 = obj1.getAge();
	       int age2 = obj2.getAge();	            
	       if (age1 < age2) {
	            return 1;
	        } else if (age1 > age2) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }
	}


