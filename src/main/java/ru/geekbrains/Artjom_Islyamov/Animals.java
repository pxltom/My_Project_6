package ru.geekbrains.Artjom_Islyamov;

public abstract class Animals {
    protected String name;
    protected double maxDistanceToRun; //дистанция бега
    protected double maxDistanceToSwim; //дистанция по воде

    public Animals(String name, double maxDistanceToRun, double maxDistanceToSwim) {
        this.name = name;
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = maxDistanceToSwim;

    }

    abstract void running(double distance_run);

    abstract void swimming(double distance_sw);

    public void showInfo() {
        System.out.printf("name = %s, max_length = %f, max_length_swim = %f%n", name, maxDistanceToRun, maxDistanceToSwim);
    }

}
