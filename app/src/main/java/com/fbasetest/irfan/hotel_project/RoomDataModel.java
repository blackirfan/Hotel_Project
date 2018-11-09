package com.fbasetest.irfan.hotel_project;

public class RoomDataModel {

    public String room_name;
    public String room_number;
    public String room_size;
    public String room_person_capacity;
    public String price;
    public String extra_facilities;
    public int room_image;

    public RoomDataModel(String room_name, String room_number, String room_size, String room_person_capacity, String price, String extra_facilities, int room_image) {
        this.room_name = room_name;
        this.room_number = room_number;
        this.room_size = room_size;
        this.room_person_capacity = room_person_capacity;
        this.price = price;
        this.extra_facilities = extra_facilities;
        this.room_image = room_image;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getRoom_size() {
        return room_size;
    }

    public void setRoom_size(String room_size) {
        this.room_size = room_size;
    }

    public String getRoom_person_capacity() {
        return room_person_capacity;
    }

    public void setRoom_person_capacity(String room_person_capacity) {
        this.room_person_capacity = room_person_capacity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExtra_facilities() {
        return extra_facilities;
    }

    public void setExtra_facilities(String extra_facilities) {
        this.extra_facilities = extra_facilities;
    }

    public int getRoom_image() {
        return room_image;
    }

    public void setRoom_image(int room_image) {
        this.room_image = room_image;
    }
}
