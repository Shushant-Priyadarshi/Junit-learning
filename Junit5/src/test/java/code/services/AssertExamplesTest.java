package code.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertExamplesTest {

    @Test
    @DisplayName("Assert Array ")
    void checkArray(){
        int[] result = {1,2,3,4,5};
        int[] expected = {1,2,3,5,4};
        Assertions.assertArrayEquals(expected,result); // checks the value
        //Assertions.assertSame(expected,result); //checks if belongs to the same object
     }
}
