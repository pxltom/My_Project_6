package ru.geekbrains.Artjom_Islyamov;

import sun.dc.pr.PRError;

public abstract class Animals {
    private int run;
    private int swim;


    public Animals(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }


}
