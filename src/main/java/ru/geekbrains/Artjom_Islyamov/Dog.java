package ru.geekbrains.Artjom_Islyamov;

public class Dog extends Animals {
    final int maxDistanceToRun = 500;
    final double maxDistanceToSwim = 10;

    public Dog(String name, double max_length, double max_length_swim) {
        super(name, max_length, max_length_swim);
    }

    @Override
    void running(double distance_run) {
        if (distance_run > maxDistanceToRun) {
            System.out.println(getName() + " не сможет столько пробежать. Дистанция " + distance_run + " слишком длинная.");
        } else if (distance_run < 0) {
            System.out.println("Ошибка!!!отрицательное число");
        } else System.out.println(getName() + " бежит " + distance_run + ".");
    }

    @Override
    void swimming(double distance_sw) {

        if (distance_sw > maxDistanceToSwim) {
            System.out.println(getName() + " не сможет столько проплыть. Дистанция " + distance_sw + " слишком длинная.");
        } else if (distance_sw < 0) {
            System.out.println("Ошибка!!!отрицательное число");
        } else System.out.println(getName() + " плывёт " + distance_sw + ".");
    }

    private static int count;
}
