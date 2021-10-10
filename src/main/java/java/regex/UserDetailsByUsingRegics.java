package java.regex;
import java.util.regex.*;
public class UserDetailsByUsingRegics{
	
	public boolean FirstName(String Firstname) {
		
		Pattern pat=Pattern.compile("^[A-Z]{1}[a-z]{2}[a-z]*$");
		Matcher match=pat.matcher(Firstname);
	   boolean result=match.matches();
		return result;
	
	}
	
	
}
