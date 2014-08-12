package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnasr on 8/11/2014.
 */
public class ClockTest {
    @Test
    public void angleBetweenHourAndMinuteArm_1(){
        Assert.assertEquals(0.0,Clock.angleBetweenHourAndMinuteArm(12,0));
    }
    @Test
    public void angleBetweenHourAndMinuteArm_2(){
        Assert.assertEquals(180.0-15.0,Clock.angleBetweenHourAndMinuteArm(12,30));
    }

    @Test
    public void angleBetweenHourAndMinuteArm_3(){
        Assert.assertEquals(90.0,Clock.angleBetweenHourAndMinuteArm(9,0));
    }

    @Test
    public void angleBetweenHourAndMinuteArm_4(){
        Assert.assertEquals(90.0+180.0-15.0,Clock.angleBetweenHourAndMinuteArm(9,30));
    }

    @Test
    public void angleBetweenHourAndMinuteArm_5(){
        Assert.assertEquals(32.5,Clock.angleBetweenHourAndMinuteArm(9,55));
    }

    @Test
    public void angleBetweenHourAndMinuteArm_6(){
        Assert.assertEquals(270.0,Clock.angleBetweenHourAndMinuteArm(3,0));
    }
}
