package code.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTest {

    static  int counter =1;

    @BeforeAll
    static void init(){
        System.out.println("Test is going to start!!");
    }

    @BeforeEach
    void beforeEach(TestInfo testInfo){
        System.out.println("Test "+counter+": "+testInfo.getDisplayName());
        counter++;
    }

    @Test
    @DisplayName("Addition")
     void sumTest(){
        int result = CalculatorService.sum(12, 12);
        int expected = 24;
        Assertions.assertEquals(expected,result,"Test Failed");

    }

    @Test
    @DisplayName("Sum of Numbers")
    void sumOfNumbersTest(){
        int result =  CalculatorService.sumOfNumbers(1,2,3,4,5);
        int expected = 15;
        Assertions.assertEquals(expected,result,"Test Failed");
    }

    @AfterAll
    static void exit(){
        System.out.println("Test is Ending!!");
        counter =1;
    }
}
