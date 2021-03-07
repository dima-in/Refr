package com.company;

public class Freezer {
    boolean doorSensor; // true - дверь открыта, false - закрыта
    boolean doorTimer;  // true - дверь открыта более 20 секунд
    double tempReader ; //датчик температуры


    Freezer(){
        doorSensor = false;
        doorTimer = false;
        tempReader = -25;
    }
}
