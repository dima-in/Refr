package com.company;

public class Signal {
    Fridge fridge = new Fridge();
    Freezer freezer =new Freezer();

    boolean signal = false; // true -  сигнал вкл, false - сигнал выкл
    public boolean signal() {
        if (fridge.doorTimer) {
            System.out.println("Сигнал");
            return signal = true;
        }
        else
            return signal = false;
    }
}
