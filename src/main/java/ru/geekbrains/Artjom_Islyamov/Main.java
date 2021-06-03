package ru.geekbrains.Artjom_Islyamov;

public class Main {
    public static void main(String[] args) {
        Cat eak = new Cat("КотиГ", 0, 0);
        Dog lucky = new Dog("Лаки", 0, 0);
        eak.running(200);
        eak.swimming(0);
        lucky.running(500);
        lucky.swimming(10);
        eak.showInfo();
        lucky.showInfo();


        ////// Dog pesik = new Dog();


    }
}
