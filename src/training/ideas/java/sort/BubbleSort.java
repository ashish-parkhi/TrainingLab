package training.ideas.java.sort;

/**
 * Created by idnasr on 7/29/2014.
 */
public class BubbleSort {

    private enum SortOrder {ASC, DESC}

    ;

    private static boolean sortCondition(final int lhsElement, final int rhsElement,SortOrder sortOrder) {
        return sortOrder==SortOrder.ASC ? lhsElement > rhsElement : lhsElement < rhsElement;
    }

    private static int[] sort(final int[] inputNumbers, SortOrder sortOrder){
        for(int elementCounter=0;elementCounter<inputNumbers.length-1;elementCounter++) {
            for (int swapCounter = 0; swapCounter < inputNumbers.length - 1 - elementCounter; swapCounter++) {
                if (sortCondition(inputNumbers[swapCounter],inputNumbers[swapCounter+1],sortOrder)) {
                    int tempNumberValue = inputNumbers[swapCounter];
                    inputNumbers[swapCounter] = inputNumbers[swapCounter + 1];
                    inputNumbers[swapCounter + 1] = tempNumberValue;
                }
            }
        }
        return inputNumbers;
    }

    public static int[] asc(final int[] inputNumbers)
    {
        return sort(inputNumbers,SortOrder.ASC);
    }
    public static int[] desc(int[] inputNumbers) {
        return sort(inputNumbers,SortOrder.DESC);
    }
}
