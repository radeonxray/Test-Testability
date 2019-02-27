package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSmellsAndNoTestAbleCode {


    @Test
    void testRandomNumber() {

        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();

        //While testable, it will be (very unlikely and close to ) impossible for the test to be successfull
        assertEquals(NTACAS.RandomNumber(), 50);
    }

    @Test
    void testCalculateTwoNumbers() {

        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();
        //NTACAS.calculateTwoNumbers();
        //Can't Assert or test the above method, since it is Void, which is the point to demonstrate bad coding practices.

    }

    @Test
    void testLongMethodName(){
        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();
        assertEquals("Hello World!" ,NTACAS.thisMethodHasAnExtremeLongNameJustToPrintASentenceToTheConsole("Hello World!"));
    }

    @Test
    void testDeadCode(){
        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();
        assertEquals(20, NTACAS.DeadCode(10,10));
    }

    @Test
    void testCalculateFivePercent(){
        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();
        assertEquals(5,NTACAS.calculateFivePercent(100));
    }

    @Test
    void testPrintName(){
        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();
        assertEquals("Steve Jobs", NTACAS.printName("Steve","Jobs"));
    }

    @Test
    void testReturnArrayItem(){

        NonTestableCodeAndSmells NTACAS = new NonTestableCodeAndSmells();
        assertEquals("Cheese", NTACAS.returnArrayItem(1));
    }



}