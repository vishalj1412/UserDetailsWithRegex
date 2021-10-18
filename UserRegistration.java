package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

        public boolean FirstName(String Firstname) {

            Pattern pat= Pattern.compile("^[A-Z][a-z]{2}[a-z]*$");
            Matcher match=pat.matcher(Firstname);
            boolean result=match.matches();
            return result;

        }


}
