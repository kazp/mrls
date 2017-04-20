/**
 * Created by igor.salikov on 14.03.2017.
 */
/*public class Main {
    public static void main(String[] args){
        AddressBook add = new AddressBook();
        add.enterName();
        //add.getFirstName();
        System.out.print(add.getFirstName());
    }


}*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {


    public static void main(String[] args){

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat").intern();;
        // сравниваем наши строки

        System.out.println("s1 == s2 : " + ( s1 == s2 ) );
        System.out.println("s1 == s3 : " + ( s1 == s3 ) );

        String z1 = "Test";
        String z2 = "Test";
        String z3 = new String("Test").intern();
        final String s4 = s3.intern();
        System.out.println(z1 == z2);
        System.out.println(z2 == z3);
        System.out.println(z3 == s4);
        System.out.println(z1 == z3);
        System.out.println(z1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

        System.out.println("Cool check:");

        System.out.println(checkWithRegExp("_@BEST"));
        System.out.println(checkWithRegExp("vovan"));
        System.out.println(checkWithRegExp("vo"));
        System.out.println(checkWithRegExp("Z@OZA"));

        System.out.println("\nDumb check:");

        System.out.println(dumbCheck("_@BEST"));
        System.out.println(dumbCheck("vovan"));
        System.out.println(dumbCheck("vo"));
        System.out.println(dumbCheck("Z@OZA"));
    }

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static boolean dumbCheck(String userNameString){

        char[] symbols = userNameString.toCharArray();
        if(symbols.length < 3 || symbols.length > 15 ) return false;

        String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        for(char c : symbols){
            if(validationString.indexOf(c)==-1) return false;
        }

        return true;
    }
}
