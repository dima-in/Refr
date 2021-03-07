package com.company;

public class Main {

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel(); //задает температуру холодильной и морозильной камеры

        Light light = new Light(false,false); // включает и выключает подсветку при открытии двецы

        Cooling cooling = new Cooling(); // включает и выключает копрессоры
                                        // поддерживает заданную температуру
                                        // в холодильной и морозильной камере

        Signal signal = new Signal(); // подает звуковой сигнал при открытии любой дверцы более минуты

        Freezer freezer = new Freezer(); // морозильная камера, все параметры

        Fridge fridge = new Fridge(signal); // основная холодильная камера, все параметры

        cooling.coolFridge();
        System.out.println(cooling.compressor_1_Switch);
        cooling.coolFreezer();
        System.out.println(cooling.compressor_2_Switch);

        light.fridgeLight();
        light.freezerLight();

        signal.signal();

        // Думал как лучше, передавать значеня температуры
        // для проверки: как аргумет при вызове метода или в
        // классе инициализировать, показалось, что в классе лучше
        // сгрупировать все параметры
        // интерфейсы вместо классов







    }
}
