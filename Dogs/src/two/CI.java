package two;

import java.util.Scanner;
public class CI {
	Scanner scanner = new Scanner(System.in);
	int n = 0;
	boolean isNumber;
	String[] enteredDogsArray;
	boolean isLessThan;
	
	public CI(){
		String[] enteredDogsArray = GetEntrance();
	}	
// тут мы проверяем ввод с консоли на валидность (почти весь) и возвращаем его в массив enteredDogsArray 	
public String[] GetEntrance(){
	do {System.out.print("Enter number of dogs and names divided by space ");
		String enteredDogs = scanner.nextLine();
		enteredDogsArray = enteredDogs.split(" ");
		
		if (enteredDogsArray[0].matches("[0-9]*"))
		{
			isNumber = true;
			n = Integer.parseInt(enteredDogsArray[0]);
			}
		if (isNumber && enteredDogsArray.length-1<=n)
		{
			isLessThan = true;
			}
		if (isNumber && !(isLessThan))
		{
			System.out.println("Please enter no more than "+n+" dogs");
			}
		
		if (!(isNumber))  {			
		System.out.println("Number of dogs should be numeric only: ");}
		
	} while ((!isNumber || !isLessThan));
	return enteredDogsArray;}
}


