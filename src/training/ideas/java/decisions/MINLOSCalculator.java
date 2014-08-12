package training.ideas.java.decisions;

/**
 * Created by idnasr on 7/28/2014.
 */
public class MINLOSCalculator {
    public static int generateMinLOS(String fplosPattern) {
        return fplosPattern.toUpperCase().indexOf("Y")+1;

    }
}
