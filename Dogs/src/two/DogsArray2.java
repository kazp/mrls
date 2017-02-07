package two;

import java.util.Arrays;
import java.util.Scanner;

public class DogsArray2 {
	// получаем неотсортированный массив собак
	public static Dog[] GetUnsortedArray(){
		CI ci = new CI();	
		int n = Integer.parseInt(ci.enteredDogsArray[0]);
		Dog dogs[] = new Dog[n];{
		for (int i = 0; i < n; i++ ){
		     dogs[i] = new Dog();}
		for (int i = 0; i < ci.enteredDogsArray.length-1; i++ ){
		     dogs[i].name = ci.enteredDogsArray[i+1];}
		return dogs;}
	}
	// сортируем массив собак
	public static void GetSortedArray(){
		
		Dog dogs[] =  GetUnsortedArray();
		 System.out.println("------------ Ваш неотсортированный список -----------");
			
	        for(Dog dog : dogs)
	            System.out.println(dog.toString());
		
		System.out.println("The following sorting are available. \n 1 - Sort by Name asc. "
				+ "\n 2 - Sort by Name desc. \n 3 - Sort by Age asc. "
				+ "\n 4 - Sort by Age desc." + "\n 5 - Sort by Size asc. \n 6 - Sort by Size desc");
		System.out.println("Enter a number of sorting if you wish");
		String sortorderString;
		Scanner scanner4 = new Scanner(System.in);		  
		sortorderString = scanner4.nextLine();
			  int sortorder = Integer.parseInt(sortorderString);
		
		if (sortorder == 1){
			Arrays.sort(dogs, new SortedByName());
	        System.out.println("------------ сортировка по имени асц -----------");
			
		        for(Dog dog : dogs)
		            System.out.println(dog.toString());
		}
		if (sortorder == 2){
			Arrays.sort(dogs, new SortedByNameDesc());
	        System.out.println("------------ сортировка по имени десц -----------");
			
		        for(Dog dog : dogs)
		            System.out.println(dog.toString());
		}
		if (sortorder == 3){
			Arrays.sort(dogs, new SortedByAge());
	        System.out.println("------------ сортировка по эйджу асц -----------");
			
		        for(Dog dog : dogs)
		            System.out.println(dog.toString());
		}
		if (sortorder == 4){
			Arrays.sort(dogs, new SortedByAgeDesc());
	        System.out.println("------------ сортировка по эйджу десц -----------");
			
		        for(Dog dog : dogs)
		            System.out.println(dog.toString());
		}
		if (sortorder == 5){
			Arrays.sort(dogs, new SortedBySize());
	        System.out.println("------------ сортировка по размеру асц-----------");
			
		        for(Dog dog : dogs)
		            System.out.println(dog.toString());
		}
		if (sortorder == 6){
			Arrays.sort(dogs, new SortedBySizeDesc());
	        System.out.println("------------ сортировка по размеру десц -----------");
			
		        for(Dog dog : dogs)
		            System.out.println(dog.toString());
		}
		scanner4.close();
		}
	}



