package ru.geekbrains.Artjom_Islyamov;

public class Dog extends Animals {
    public Dog(String name, double max_length, double max_length_swim) {
        super(name, max_length, max_length_swim);
    }

    @Override
    void running(double distance_run) {
        if (maxDistanceToRun <= distance_run && distance_run > 500) {
            System.out.println(name + " не сможет столько пробежать. Дистанция " + distance_run + " слишком длинная.");
        } else if (maxDistanceToRun < 0 || distance_run < 0) {
            System.out.println("Ошибка!!!отрицательное число");
        } else System.out.println(name + " бежит " + distance_run + ".");
    }


    @Override
    void swimming(double distance_sw) {
        if (maxDistanceToSwim <= distance_sw && distance_sw > 10) {
            System.out.println(name + " не сможет столько проплыть. Дистанция " + distance_sw + " слишком длинная.");
        }else if (maxDistanceToRun < 0 || distance_sw < 0) {
                System.out.println("Ошибка!!!отрицательное число");
        } else System.out.println(name + " плывёт " + distance_sw + ".");
    }
}
