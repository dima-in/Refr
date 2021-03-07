package com.company;

public class Fridge implements Handler{
    boolean doorSensor; // true - дверь открыта, false - закрыта
    boolean doorTimer;  // true - дверь открыта более 60 секунд
    double tempReader ; // датчик температуры

    Signal signal;
    Light light;
    Timer timer;


    void doorOoen(){
        light.on();
        timer.setTimer(60000, this); // fridge реализует Handler
    }


    Fridge(Signal signal, Light light, Timer timer){
        this.signal = signal;
        this.light = light;
        this.timer = timer;

    }

    @Override
    public void timerOn() {
        signal.on();
    }
}
