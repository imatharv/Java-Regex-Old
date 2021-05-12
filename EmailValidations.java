import java.util.regex.*;
import java.util.*;

public class EmailValidations {
    public static boolean isValidEmail(String emailId) {
        String regex = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";
        Pattern p = Pattern.compile(regex);
        if (emailId == null) {
            return false;
        }
        Matcher m = p.matcher(emailId);
        return m.matches();
    }
    
    public static void main(String args[]) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = object.nextLine();
        if ((isValidEmail(email)) == true) {
            System.out.println("That's a valid email address.");
        } else if ((isValidEmail(email)) == false) {
            System.out.println("That's an invalid email address.");
        }
    }
}
