package ru.geekbrains.Artjom_Islyamov;

public class Cat extends Animals {

    public Cat(String name, final double maxDistanceToRun, final double maxDistanceToSwim) {
        super(name, maxDistanceToRun, maxDistanceToSwim);
    }

    // ограничения по бегу и плаванию можно определить как в самих наследниках , так и в вызываемом конструкторе
    //не совсем понял как лучше это сделать, поэтому сделал и так и так
    @Override
    void running(double distance_run) {
        final int maxDistanceToRun = 200;
        if (distance_run > maxDistanceToRun) {
            System.out.println(name + " не сможет столько пробежать. Дистанция " + distance_run + " слишком длинная.");
        }else if(distance_run<0){
            System.out.println("Ошибка!!!отрицательное число");
        }
        else System.out.println( name + " бежит " + distance_run + ".");
    }
    @Override
    void swimming(double distance_sw) {
        System.out.println( name + "Не умеет плавать!!!");
    }

}





