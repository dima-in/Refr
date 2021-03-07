package com.company;

public class Light {
    Fridge fridge = new Fridge(); //создаю экземпляр класса
    Freezer freezer = new Freezer();


    boolean light_1_Switch; // true - свет включен false - свет выключен
    boolean light_2_Switch;

    public boolean on() {
        light_1_Switch = true;
        return true;
    }
    public boolean off() {
        light_1_Switch = false;
        return false;
    }

    Light(boolean light_1_Switch, boolean light_2_Switch) {
        this.light_1_Switch = light_1_Switch;
        this.light_2_Switch = light_2_Switch;
    }
    public boolean fridgeLight(){
        if (fridge.doorSensor) {
            fridge.on();
            //System.out.println("Свет в холодильной камере включен");
            return light_1_Switch = true;
        }
        else {
            //System.out.println("Свет в холодильной камере выключен");
            return light_1_Switch = false;
        }
    }
    public boolean freezerLight(){
        if (freezer.doorSensor){

            //System.out.println("Свет в морозильной камере включен");
            return light_2_Switch = true;
        }
        else {
            //System.out.println("Свет в морозильной камере выключен");
            return light_2_Switch = false;
        }
    }


}
