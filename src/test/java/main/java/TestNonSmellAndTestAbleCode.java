package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNonSmellAndTestAbleCode {

    @Test
    void testCalculateTwoNumbers(){
       TestAbleAndCleanCode TAACC = new TestAbleAndCleanCode();
       assertEquals(170, TAACC.calculateTwoNumbers());
    }

    @Test
    void testDeadCode(){
        TestAbleAndCleanCode TAACC = new TestAbleAndCleanCode();
        assertEquals(60, TAACC.DeadCode(30,30));
    }

    @Test
    void testCalculateFivePercent(){
        TestAbleAndCleanCode TAACC = new TestAbleAndCleanCode();
        assertEquals(5, TAACC.calculateFivePercentGood(100));
    }

    @Test
    void testPrintSentence(){
        TestAbleAndCleanCode TAACC = new TestAbleAndCleanCode();
        assertEquals("Wohoo World!", TAACC.printSentence("Wohoo World!"));
    }

    @Test
    void testPrintName(){
        TestAbleAndCleanCode TAACC = new TestAbleAndCleanCode();
        Person sj = new Person("Steve","Jobs","Cuppertino","USA","Seattle","Inventor","Ceo","1 Infinite Loop","Laura Jobs",54,3,2,43);
        assertEquals("Steve Jobs", TAACC.printName(sj));
    }

    @Test
    void testReturnArrayItem(){
        TestAbleAndCleanCode TAACC = new TestAbleAndCleanCode();
        assertEquals("CocaCola", TAACC.returnArrayItem(0));
    }
}
