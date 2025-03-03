package code.service;

import code.services.CalculatorService;
import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    @BeforeClass
    public static void testStart(){
        System.out.println("Tests Starts: "+ new Date());
    }

    @Before
    public void beforeAnyTest(){
        System.out.println("Before any test");
    }

    @After
    public void afterAnyTest(){
        System.out.println("After any test");
    }

    @Test
    public void sumTest(){
        System.out.println("Test for sumTest");
        int result = CalculatorService.sum(30, 23);
        int expected = 53;
        Assert.assertEquals(expected,result);
    }

    @Test(timeout = 2000) //2s time
    public void sumOfNumbers() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test for sumOfNumbers");
        int result = CalculatorService.sumOfNumbers(23, 12, 43, 54);
        int expected =132;
        Assert.assertEquals(expected,result);
    }

    @AfterClass
    public static void testEnd(){
        System.out.println("Tests Ends: "+ new Date());
    }
}
