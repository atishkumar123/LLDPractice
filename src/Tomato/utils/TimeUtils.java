package Tomato.utils;

import java.time.LocalDateTime;

public class TimeUtils {

    public static String getCurrentTime(){
        try {
             LocalDateTime localDateTime=LocalDateTime.now();
             return localDateTime.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
