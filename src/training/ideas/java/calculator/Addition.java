package training.ideas.java.calculator;

/**
 * Created by idnasr on 7/22/2014.
 */
public class Addition {

    private static int counter=0;

    public static int perform(int first, int second) {
        counter++;
        return first+second;
    }


    public static double perform(double ...doublesNumbers) {
        double sum=0;
        for(double individualElement: doublesNumbers){
            sum+=individualElement;
        }
        return sum;
    }
}
