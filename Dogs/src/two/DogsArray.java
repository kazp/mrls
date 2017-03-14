package two;

import java.util.Arrays;
import java.util.Scanner;

class DogsArray {

    private Scanner scanner = new Scanner(System.in);
    private int n = 0;
    private boolean isNumber;
    private boolean isLessThan;


    /**
     * Method to get a number of dogs and their names from console and sort the array by age, size or name
     */
    void GetUnsortedArray() {

    String[] enteredDogsArray;

	do {
		System.out.print("Enter number of dogs and names divided by space ");
		String enteredDogs = scanner.nextLine();
		enteredDogsArray = enteredDogs.split(" ");

		if (enteredDogsArray[0].matches("[0-9]+") && !enteredDogsArray[0].equals("0")) {
			isNumber = true;
			n = Integer.parseInt(enteredDogsArray[0]);
			}
		if (isNumber && enteredDogsArray.length - 1 <= n) {
			isLessThan = true;
			}
		if (isNumber && !isLessThan) {
			System.out.println("Please enter no more than " + n + " names for dogs");
			}
		if (!isNumber) {
			System.out.println("Number of dogs should be non zero whole number: ");
			}

	} while (!isNumber || !isLessThan);

	Dog dogs[] = new Dog[n];

	for (int i = 0; i < n; i++) {
		dogs[i] = new Dog();
		}
	for (int i = 0; i < enteredDogsArray.length - 1; i++) {
		dogs[i].name = enteredDogsArray[i + 1];
		}

	System.out.println("------------ Ваш неотсортированный список -----------");

	for (Dog dog : dogs)
		System.out.println(dog.toString());

	System.out.println("The following sorting are available. \n 1 - Sort by Name asc. "
				+ "\n 2 - Sort by Name desc. \n 3 - Sort by Age asc. "
				+ "\n 4 - Sort by Age desc." + "\n 5 - Sort by Size asc. \n 6 - Sort by Size desc");

	System.out.println("Enter a number of sorting if you wish");
	Scanner scanner4 = new Scanner(System.in);
    String sortorderString = scanner4.nextLine();
	int sortorder = Integer.parseInt(sortorderString);

	if (sortorder == 1) {
		Arrays.sort(dogs, new SortedByName());
		System.out.println("------------ сортировка по имени асц -----------");

		for (Dog dog : dogs)
			System.out.println(dog.toString());
		}
	if (sortorder == 2) {
		Arrays.sort(dogs, new SortedByNameDesc());
		System.out.println("------------ сортировка по имени десц -----------");

		for (Dog dog : dogs)
			System.out.println(dog.toString());
		}
	if (sortorder == 3) {
		Arrays.sort(dogs, new SortedByAge());
		System.out.println("------------ сортировка по эйджу асц -----------");

		for (Dog dog : dogs)
			System.out.println(dog.toString());
		}
	if (sortorder == 4) {
		Arrays.sort(dogs, new SortedByAgeDesc());
		System.out.println("------------ сортировка по эйджу десц -----------");

		for (Dog dog : dogs)
			System.out.println(dog.toString());
		}
	if (sortorder == 5) {
		Arrays.sort(dogs, new SortedBySize());
		System.out.println("------------ сортировка по размеру асц-----------");

		for (Dog dog : dogs)
			System.out.println(dog.toString());
		}
	if (sortorder == 6) {
		Arrays.sort(dogs, new SortedBySizeDesc());
		System.out.println("------------ сортировка по размеру десц -----------");

		for (Dog dog : dogs)
			System.out.println(dog.toString());
		}
		scanner4.close();
		}
	}




