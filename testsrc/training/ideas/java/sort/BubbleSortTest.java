package training.ideas.java.sort;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnasr on 7/29/2014.
 */
public class BubbleSortTest {
    @Test
    public void testBubbleSort_asc(){
        int [] inputNumbers = {4,10,3,6,9,7,8,18,15,7,25,-10};
        int [] expectedSortedNumbers = {-10,3,4,6,7,7,8,9,10,15,18,25};
        int [] actualSortedNumbers = BubbleSort.asc(inputNumbers);
        int  counter=0;
        for (int individualExpectedNumber: expectedSortedNumbers){
            Assert.assertEquals(individualExpectedNumber,actualSortedNumbers[counter++]);
        }
    }

    @Test
    public void testBubbleSort_desc(){
        int [] inputNumbers = {4,10,3,6,9,7,8,18,15,7,25,-10};
        int [] expectedSortedNumbers = {25,18,15,10,9,8,7,7,6,4,3,-10};
        int [] actualSortedNumbers = BubbleSort.desc(inputNumbers);
        int  counter=0;
        for (int individualExpectedNumber: expectedSortedNumbers){
            Assert.assertEquals(individualExpectedNumber,actualSortedNumbers[counter++]);
        }
    }


}
