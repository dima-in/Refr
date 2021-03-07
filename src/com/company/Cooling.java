package com.company;

public class Cooling extends ControlPanel {
    Freezer freezer = new Freezer();
    Fridge fridge = new Fridge();

    boolean compressor_1_Switch; //true - компрессор включен, false - выключен
    boolean compressor_2_Switch;

    double tempReader; // данные с датчика температуры
    Cooling(){
        super.tempLevelFridge = tempLevelFridge; // температура холодильной камеры, заданная на панели управления
        super.tempLevelFreezer = tempLevelFreezer; // температура морозильной камеры, заданная на панели управления
        compressor_1_Switch = true;
    }

    public boolean coolFridge(){  // холодильная камера
        if(fridge.tempReader > tempLevelFridge) {
            System.out.println("Компрессор холодильника вкл " + fridge.tempReader);
            return compressor_1_Switch = true;
        }
        else {
            System.out.println("Компрессор холодильника выкл " + fridge.tempReader);
            return compressor_1_Switch = false;
        }
    }

    public boolean coolFreezer(){  // морозильная камера
        if (tempLevelFreezer < freezer.tempReader) {
            System.out.println("Морозилка вкл " + freezer.tempReader);
            return compressor_2_Switch = true;
        }
        else {
            System.out.println("Морозилка выкл " + freezer.tempReader);
            return compressor_2_Switch = false;
        }
    }
}
