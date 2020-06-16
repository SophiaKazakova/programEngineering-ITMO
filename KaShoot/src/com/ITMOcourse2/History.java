package com.ITMOcourse2;

public class History {
	/**
    * Here is some info about the History class
    *
    */
    public static void historyOut(Log current) {
    	/**
    	* Here is some info about the historyOut fun
    	*
    	*/
        for (String theShot : current.getLog()) {
            System.out.println(theShot);
        }
    }
}
