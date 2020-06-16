package com.ITMOcourse2;

public class Shot {
    /**
    * Here is some info about the Shot class
    *
    */
    private final double x;
    private final int y;
    private final double R;

    public Shot(double x, int y, double R) {
        this.x = x;
        this.y = y;
        this.R = R;
    }

    public double getX() {
        return x;
    }

    public double getR() {
        return R;
    }

    public int getY() {
        return y;
    }

    public boolean shotSuccess() {
        Area area = new Area(R);
        return area.checkShot(x, y);
    }
}
