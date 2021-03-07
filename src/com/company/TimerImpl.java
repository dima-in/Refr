package com.company;

public class TimerImpl implements Timer {
    @Override
    public void setTimer(long interval, Handler handler) {
        handler.timerOn();
    }
}
