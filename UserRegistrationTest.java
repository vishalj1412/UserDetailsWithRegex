package regex;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

class UserRegistrationTest {
        @Test
        public void Test() {

            UserRegistration obj=new UserRegistration();
            assertTrue(obj.FirstName("Vishal"));
            //assertTrue(obj.LastName("Jagtap"));

        }
    }


