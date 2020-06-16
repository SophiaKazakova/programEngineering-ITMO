package com.ITMOcourse2;

public class Area {
    private final double R;

    public Area(double R) {
        this.R = R;
    }

    public boolean checkShot(double x, int y) {
        if (x < 0 & y > 0) {
            return false;
        }
        else if ((x >= 0) & (y >= 0)) {
            return x <= R/2 & y <= R;
        }
        else if ((x >= 0) & (y <= 0)) {
            return x*x + y*y <= R*R;
        }
        else if ((x <= 0) & (y <= 0)) {
            return y >= -0.5*x - 0.5*R;
        }
        else
            return false;
    }
}
