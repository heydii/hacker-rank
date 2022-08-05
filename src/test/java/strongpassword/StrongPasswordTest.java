package strongpassword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongPasswordTest {

    @Test
    void testMinimumNumber(){
        assertEquals(3, Result.minimumNumber(3, "Ab1"));
    }
}