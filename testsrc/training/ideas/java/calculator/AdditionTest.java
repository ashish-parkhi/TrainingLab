package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnasr on 7/21/2014.
 */
public class AdditionTest {

    @Test
    public void addTwoIntegers(){

        Assert.assertEquals(2+3,Addition.perform(2, 3));


        Assert.assertEquals(8,Addition.perform(5, 3));

        Assert.assertEquals(2+3,Addition.perform(2, 3));
        Assert.assertEquals(8,Addition.perform(5, 3));
    }

    @Test
    public void given_6_and_4__then__addition_of__two__numbers_should_be_10(){
        Assert.assertEquals(10,Addition.perform(4, 6));
    }

    @Test
    public void given_minus_6_and_minus_4__then__addition_of__two__numbers_should_be_minus_10(){
        Assert.assertEquals(-10,Addition.perform(-4, -6));
    }

    @Test
    public void given_minus_6_and_plus_4__then__addition_of__two__numbers_should_be_minus_2(){
        Assert.assertEquals(-2,Addition.perform(4, -6));

    }

    @Test
    public void addTwoDoubles(){
        Assert.assertEquals(5.2+7.1,Addition.perform(5.2, 7.1));
    }


    @Test
    public void addDoubleArray(){
        double [] dArray = {2.5,3.1,4.7,7.8};

        Assert.assertEquals(2.5+3.1+4.7+7.8,Addition.perform(dArray));
    }

    @Test
    public void addVariableDoubleNumbers(){
        Assert.assertEquals(1.1+2.1+3.1+4.1+5.1+6.1,Addition.perform(1.1,2.1,3.1,4.1,5.1,6.1));
    }

    @Test
    public void addVariableDoubleAndIntegerNumbers(){
        Assert.assertEquals(1+2+3.1+4.1+5.1+6.1,Addition.perform(1,2,3.1,4.1,5.1,6.1));
    }

}
