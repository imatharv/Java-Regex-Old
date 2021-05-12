import java.util.regex.*;
import java.util.*;

public class PinValidations {
    public static boolean isValidPinCode(String pinCode) {
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        Pattern p = Pattern.compile(regex);
        if (pinCode == null) {
            return false;
        }
        Matcher m = p.matcher(pinCode);
        return m.matches();
    }

    public static void main(String args[]) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a pin code: ");
        String pin = object.nextLine();
        if ((isValidPinCode(pin)) == true) {
            System.out.println("That's a valid pin code.");
        } else if ((isValidPinCode(pin)) == false) {
            System.out.println("That's an invalid pin code.");
        }
    }
}
