package training.ideas.java.calculator;

/**
 * Created by idnasr on 8/11/2014.
 */
public class Clock {
    static final int MINUTES_IN_ONE_HOUR=60;
    static final int MINUTE_HAND_DEGREES_PER_MINUTE=360/MINUTES_IN_ONE_HOUR;
    static final double HOUR_HAND_DEGREES_PER_MINUTE=MINUTE_HAND_DEGREES_PER_MINUTE*5/(double)MINUTES_IN_ONE_HOUR;
    static final double HOUR_HAND_DEGREES_PER_HOUR=HOUR_HAND_DEGREES_PER_MINUTE*MINUTES_IN_ONE_HOUR;

    public static double angleBetweenHourAndMinuteArm(final int hour, final int minutes) {
        int inHours=hour;
        if(hour>=12){
            inHours=inHours-12;
        }

        double minuteHandDistanceFrom0=minutes*MINUTE_HAND_DEGREES_PER_MINUTE;
        double hourHandDistanceFrom0=inHours*HOUR_HAND_DEGREES_PER_HOUR + HOUR_HAND_DEGREES_PER_MINUTE*minutes;
        if(hourHandDistanceFrom0 > minuteHandDistanceFrom0){
            return 360+minuteHandDistanceFrom0-hourHandDistanceFrom0;
        }

        return minuteHandDistanceFrom0-hourHandDistanceFrom0;

    }
}
