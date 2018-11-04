package fr.parisnanterre.segmi.miage.poa;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class Calculator {

    private char sign;
    private long number1;
    private long number2;
    private long result;

    @Given("a Calculator Class with the operation sign as <sign>")
    public void givenACalculatorClassWithTheOperationSignAssign(@Named("sign") String sign){
        this.sign = sign.charAt(0);

        switch(this.sign){
            case '+':
                System.out.println("Addition operation");
                break;
            case '-':
                System.out.println("Substraction operation");
                break;
            case '*':
                System.out.println("Multiplication operation");
                break;
            case '/':
                System.out.println("Division operation");
                break;
        }
    }

    @When("I give the first number as <number1>")
    public void whenIGiveTheFirstNumberAsnumber1(@Named("number1") long number1){
        this.number1 = number1;
    }

    @When("I give the second number as <number2>")
    public void whenIGiveTheSecondNumberAsnumber2(@Named("number2") long number2){
        this.number2 = number2;
    }

    @Then("I should get the result as <result>")
    public void thenIShouldGetTheResultAsresult(@Named("result") long result){

        Operations operations = new Operations();

        switch(this.sign){
            case '+':
                this.result = operations.addition(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;
            case '-':
                this.result = operations.substraction(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;
            case '*':
                this.result = operations.multiplication(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;
            case '/':
                this.result = operations.division(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;
             default:
                 System.out.println("Mauvaise operation");
        }
    }


}
