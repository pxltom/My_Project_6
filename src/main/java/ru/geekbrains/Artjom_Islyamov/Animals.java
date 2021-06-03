package ru.geekbrains.Artjom_Islyamov;

public abstract class Animals {
    public String name;
    private double maxDistanceToRun; //дистанция бега
    private double maxDistanceToSwim; //дистанция по воде

    public Animals(String name, double maxDistanceToRun, double maxDistanceToSwim) {
        this.name = name;
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = maxDistanceToSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxDistanceToRun() {
        return maxDistanceToRun;
    }

    public void setMaxDistanceToRun(double maxDistanceToRun) {
        this.maxDistanceToRun = maxDistanceToRun;
    }

    public double getMaxDistanceToSwim() {
        return maxDistanceToSwim;
    }

    public void setMaxDistanceToSwim(double maxDistanceToSwim) {
        this.maxDistanceToSwim = maxDistanceToSwim;
    }

    abstract void running(double distance_run);

    abstract void swimming(double distance_sw);

    public void showInfo() {
        System.out.printf("name = %s, max_length = %f, max_length_swim = %f%n", name, maxDistanceToRun, maxDistanceToSwim);
    }

}
