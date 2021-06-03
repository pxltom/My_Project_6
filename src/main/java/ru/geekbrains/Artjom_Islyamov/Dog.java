package ru.geekbrains.Artjom_Islyamov;

public class Dog extends Animals {
    public Dog(String name, double max_length, double max_length_swim) {
        super(name, max_length, max_length_swim);
    }

    @Override
    void running(double distance_run) {
        final int maxDistanceToRun = 500;
        if (distance_run > maxDistanceToRun) {
            System.out.println(name + " не сможет столько пробежать. Дистанция " + distance_run + " слишком длинная.");
        } else if (distance_run < 0) {
            System.out.println("Ошибка!!!отрицательное число");
        } else System.out.println(name + " бежит " + distance_run + ".");
    }


    void swimming(double distance_sw) {
        final double maxDistanceToSwim = 10;
        if (distance_sw < maxDistanceToSwim) {
            System.out.println(name + " не сможет столько проплыть. Дистанция " + distance_sw + " слишком длинная.");
        } else if (distance_sw < 0) {
            System.out.println("Ошибка!!!отрицательное число");
        } else System.out.println(name + " плывёт " + distance_sw + ".");
    }

    private static int count;
}
