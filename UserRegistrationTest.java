package regex;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

class UserRegistrationTest {
        @Test
        public void Test() {

            UserRegistration obj=new UserRegistration();
            //test case for firstname
            assertTrue(obj.FirstName("Vishal"));
            //test case for lastname
            assertTrue(obj.LastName("Jagtap"));

        }
    }


