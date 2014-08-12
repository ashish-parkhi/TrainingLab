package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnasr on 7/24/2014.
 */
public class FPLOSCalculatorTest {

    @Test
    public void given_rate_is_0__and__lrv_is_greater_than_0_for_all_7_los__then__fplos_pattern_should_be_NNNNNNN(){
        double rateValue=0.0;
        double [] lrvForSevenDays = {1.0,1.0,1.0,1.0,1.0,1.0,1.0};
        Assert.assertEquals("NNNNNNN",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }

    @Test
    public void given_rate_is_1__and__lrv_is_0_for_all_7_los__then__fplos_pattern_should_be_YYYYYYY(){
        double rateValue=1.0;
        double [] lrvForSevenDays = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        Assert.assertEquals("YYYYYYY",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }
    @Test
    public void test(){
        double rateValue=75.0;
        double [] lrvForSevenDays = {100,0,50,75,100,80,20};
        Assert.assertEquals("NYYYYYY",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }

    @Test
    public void test_1(){
        double rateValue=75.0;
        double [] lrvForSevenDays = {75.0,0,50,75,100,80,20};
        Assert.assertEquals("YYYYYYY",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }

    @Test
    public void testRateSpectrum(){
        double rateSpectrum[]= { 0 ,1, 75.5, 100};
        double [] lrvForSevenDays = {75.0,0,50,75,100,80,20};
        String expectedFPLOSPattern[] = {"NNNNNNN","NNNNNNN","YYYYYYY","YYYYYYY"};
        String actualFPLOSPattern[] = FPLOSCalculator.generateFPLOSPattern(rateSpectrum,lrvForSevenDays);
        Assert.assertEquals(expectedFPLOSPattern.length,actualFPLOSPattern.length);
        for(int counter=0;counter<rateSpectrum.length;counter++) {
            Assert.assertEquals(expectedFPLOSPattern[counter], actualFPLOSPattern[counter]);
        }
    }

}
