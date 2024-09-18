package com.example.Collections;

public class Room {
    private String roomName;
    private String typeOfRoom;

    public Room(String roomName, String typeOfRoom, int guests, double price) {
        this.roomName = roomName;
        this.typeOfRoom = typeOfRoom;
        this.guests = guests;
        this.price = price;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int guests;
    private double price;
}
