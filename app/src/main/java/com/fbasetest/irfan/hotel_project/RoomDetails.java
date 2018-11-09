package com.fbasetest.irfan.hotel_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RoomDetails extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_details);


        listView = (ListView) findViewById(R.id.list_view);



        ArrayList<RoomDataModel> roomList = roomData.getRoomList();

       RoomAdapter roomAdapter = new
               RoomAdapter(RoomDetails.this, R.layout.raw_room_details,roomList);

        listView.setAdapter(roomAdapter);
    }
}
