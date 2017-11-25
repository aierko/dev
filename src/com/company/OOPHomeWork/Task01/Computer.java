package com.company.OOPHomeWork.Task01;

/**
 * Created by User on 24.11.2017.
 */
public class Computer {
    private Mouse mouse;
    private KeyBoard keyBoard;
    private Monitor monitor;

    Computer() {
        this.mouse = new Mouse();
        this.keyBoard = new KeyBoard();
        this.monitor = new Monitor();
    }

    public Mouse getMouse() {
        return mouse;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
