package main.java;

public class TestAbleAndCleanCode {

    //Returning a number to be tested
    int calculateTwoNumbers(){

        int a = 90;
        int b = 80;

        return a + b;
    }

    //Code that is never reached
    //Removed Dead code
    //https://refactoring.com/catalog/removeDeadCode.html
    public int DeadCode(int a, int b){

        int c = a + b;


        return c;
    }

    //Inline Variable
    //https://refactoring.com/catalog/inlineVariable.html
    //Good Example
    public float calculateFivePercentGood(float number){

        return (number/100)*5;

    }

    //Looooong method name, fixed
    //Testable, but bad method name
    public String printSentence(String text){

        System.out.println(text);

        return text;
    }

    //Introduce Parameter Object
    //https://refactoring.com/catalog/introduceParameterObject.html
    // Good
    public String printName(Person person){
        System.out.println(person.firstName + " " + person.lastName);
        return person.firstName + " " + person.lastName;
    }

    //Replace Exception with Precheck
    //https://refactoring.com/catalog/replaceExceptionWithPrecheck.html
    //Good
    public String returnArrayItem(int number){

            String[] kitchenItems = {"CocaCola","Cheese","Knife","Table","Spoon","Milk","Butter"};
            number = (number < kitchenItems.length) ? number : kitchenItems.length -1;

            return kitchenItems[number];
    }
}
