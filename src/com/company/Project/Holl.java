package com.company.Project;

/**
 * Created by User on 22.12.2017.
 */
public class Holl {
   private String address;

    public Holl(String address, int room, int floor, double square, boolean isOpenOrClose) {
        this.address = address;
        this.room = room;
        this.floor = floor;
        this.square = square;
        this.isOpenOrClose = isOpenOrClose;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getAddress() {
        return address;
    }

    private int room;

    public int getRoom() {
        return room;
    }

    private int floor;

    public double getSquare() {
        return square;
    }

    public int getFloor() {
        return floor;

    }

    private double square;
   private boolean isOpenOrClose;
   public void isOpen(){
        isOpenOrClose = true;
   }
   public void isClose(){
       isOpenOrClose = false;
   }
}

