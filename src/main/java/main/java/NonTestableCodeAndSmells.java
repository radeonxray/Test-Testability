package main.java;

import java.lang.reflect.Array;
import java.util.Random;

public class NonTestableCodeAndSmells {



    //Returns a random number, making it impossible to properly test
    public int RandomNumber(){
        Random ran = new Random();
        int randomNumber = ran.nextInt((800 -1) +1) + 1;

        return  randomNumber;
    }

    /*Simple function that calculates a number, but:
     *Void, does not return anything
     *local variables
     *local result
     * private method, not public!
     * */
    void calculateTwoNumbers(){

        int a = 90;
        int b = 80;
        int c = a + b;
    }

    /*
     * Slightly different name, but the method and its content is essentially a duplicate of the first one.*/
    void calculateTwoNumbersTwo(){

        int a = 90;
        int b = 80;
        int c = a + b;
    }

    //Looooong method name
    //Testable, but bad method name
    public String thisMethodHasAnExtremeLongNameJustToPrintASentenceToTheConsole(String text){

        System.out.println(text);

        return text;
    }

    //Code that is never reached
    //https://refactoring.com/catalog/removeDeadCode.html
    public int DeadCode(int a, int b){

        int c = a + b;

        if(false){
            return 0;
        }

        return c;
    }

    //Inline Variable
    //https://refactoring.com/catalog/inlineVariable.html
    //Bad Example
    public float calculateFivePercent(float number){
        float theNumber = number;
        float calculateNumber = (theNumber/100)*5;
        return calculateNumber;


    }

    //Introduce Parameter Object
    //https://refactoring.com/catalog/introduceParameterObject.html
    // Bad
    public String printName(String firstName, String lastName){

        System.out.println(firstName + " " + lastName);
        return firstName + " " + lastName;
    }




    //Replace Exception with Precheck
    //https://refactoring.com/catalog/replaceExceptionWithPrecheck.html
    //Bad
    public String returnArrayItem(int number){

        try{
        String[] kitchenItems = {"CocaCola","Cheese","Knife","Table","Spoon","Milk","Butter"};
        return kitchenItems[number];

        } catch (Exception e){
            String[] kitchenItems = {"CocaCola","Cheese","Knife","Table","Spoon","Milk","Butter"};
        return kitchenItems[0];
        }

    }















}
