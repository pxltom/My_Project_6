package ru.geekbrains.Artjom_Islyamov;

public class Cat extends Animals {
    final int maxDistanceToRun = 200;
    final double distance_sw = 0;


    public Cat(String name, double maxDistanceToRun, double maxDistanceToSwim) {
        super(name, maxDistanceToRun, maxDistanceToSwim);
    }

    // ограничения по бегу и плаванию можно определить как в самих наследниках , так и в вызываемом конструкторе
    //ограничения определил final, а как ограничить на этапе ввода данных в конструктор создаваемого объекта так и не понял
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
        System.out.println(getName() + "Не умеет плавать!!!");
    }

}





