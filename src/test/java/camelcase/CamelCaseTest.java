package camelcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseTest {

    @DisplayName("Test result.camelcase()")
    @Test
    void testResult() {
        assertEquals(5, Result.camelcase("saveChangesInTheEditor"));
    }


}