package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
          //check entered first name is valid or not
        public boolean FirstName(String Firstname) {

            Pattern pat= Pattern.compile("^[A-Z][a-z]{2}[a-z]*$");
            Matcher match=pat.matcher(Firstname);
            boolean result=match.matches();
            return result;

        }
        //method for entered last name is valid or not
    public boolean LastName(String Lastname) {

        Pattern pat = Pattern.compile("^[A-Z][a-z]{2}[a-z]*$");
        Matcher match = pat.matcher(Lastname);
        boolean result = match.matches();
        return result;
    }
}
