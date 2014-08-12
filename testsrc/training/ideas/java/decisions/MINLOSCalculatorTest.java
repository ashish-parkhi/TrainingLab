package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnasr on 7/28/2014.
 */
public class MINLOSCalculatorTest {

    @Test
    public void given_FPLOS_as_YYYYYYY__then_MINLOS__is__1(){
        Assert.assertEquals(1,MINLOSCalculator.generateMinLOS("YYYYYYY"));
    }
    @Test
    public void given_FPLOS_as_NNNNNNN__then_MINLOS__is__0(){
        Assert.assertEquals(0,MINLOSCalculator.generateMinLOS("NNNNNNN"));
    }

    @Test
    public void given_FPLOS_as_NYNNNNN__then_MINLOS__is__2(){
        Assert.assertEquals(2,MINLOSCalculator.generateMinLOS("NYNNNNN"));
    }
    @Test
    public void given_FPLOS_as_NNNNNNY__then_MINLOS__is__7(){
        Assert.assertEquals(7,MINLOSCalculator.generateMinLOS("NNNNNNY"));

    }
}
