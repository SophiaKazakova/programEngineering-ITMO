package com.ITMOcourse2;

import java.util.ArrayList;

public class Log {
    public static ArrayList<String> log;

    public Log() {
        Log.log = new ArrayList<String>();
    }

    public void addShot(Shot shot, boolean res) {
        String result;
        String temp;
        if (res)
            result = "succeeded";
        else
            result = "missed";
        temp = "(" + shot.getX() + ", " + shot.getY() + ") : " + shot.getR() + " : " + result;
        log.add(temp);
    }

    /**
    * Here is some info about the Log class
    *
    */
    public static ArrayList<String> getLog() {
        return log;
    }
}
