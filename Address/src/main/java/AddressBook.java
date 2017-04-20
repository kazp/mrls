import java.util.Scanner;

/**
 * Created by igor.salikov on 15.03.2017.
 */
class AddressBook {

    public String getFirstName() {
        return firstName;
    }

    private String firstName;
    private String lastName;
    private int postalCode; //could be Integer if arraylist can't handle primitive types, but it will be arraylist of objects AddressBook. Will see...
    private String country;
    private String city;
    private String street;
    private String house;
    private int phoneNumber;
    Scanner scanner = new Scanner(System.in);



    String enterName() {
        System.out.print("Please enter a first name");
        //String enteredFirstName = scanner.nextLine();
        if (scanner.hasNext("[a-zA-Z]+")) {
            firstName = scanner.nextLine();
        }
        return firstName;
    }

}








