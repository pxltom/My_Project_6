package ru.geekbrains.Artjom_Islyamov;

public class Cat extends Animals {
    public Cat(String name, double max_length, double max_length_swim) {
        super(name, max_length, max_length_swim);}

    // ограничения по бегу и плаванию можно определить как в самих наследниках , так и в вызываемом конструкторе
    //не совсем понял как лучше это сделать, поэтому сделал и так и так
    @Override
    void running(double distance_run) {
        if (maxDistanceToRun <= distance_run && distance_run > 200) {
            System.out.println(name + " не сможет столько пробежать. Дистанция " + distance_run + " слишком длинная.");
        }else if(maxDistanceToRun <0 || distance_run<0){
            System.out.println("Ошибка!!!отрицательное число");
        }
        else System.out.println(name + " бежит " + distance_run + ".");
    }
    @Override
    void swimming(double distance_sw) {
        System.out.println("Не умеет плавать!!!");
    }
}





