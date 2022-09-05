package caesarcipher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @DisplayName("Test result.caesarcipher()")
    @Test
    void testResult() {
        assertEquals("Ciphering.", caesarcipher.Result.caesarCipher("Ciphering.", 26));
    }

}