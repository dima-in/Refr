package com.company;

public class Fridge{
    boolean doorSensor; // true - дверь открыта, false - закрыта
    boolean doorTimer;  // true - дверь открыта более 60 секунд
    double tempReader ; // датчик температуры

    //doorOoen(){
    //    lighting.On;
    //            setTimer();}


    Fridge(){
        doorSensor = false;
        doorTimer = true;
        tempReader = 7;
    }

}
