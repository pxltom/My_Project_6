package ru.geekbrains.Artjom_Islyamov;

public class Main {
    public static void main(String[] args) {
        Cat eak = new Cat("КотиГ", 500, 0);
        Dog lucky = new Dog("Лаки", 0, 0);
        eak.running(-300);
        eak.swimming(0);
        lucky.running(600);
        lucky.swimming(10);
        eak.showInfo();
        lucky.showInfo();


    }
}
