package com.fbasetest.irfan.hotel_project;

import java.util.ArrayList;

public class roomData {

    public static ArrayList<RoomDataModel> getRoomList(){



        ArrayList<RoomDataModel> roomName = new ArrayList<>();


        roomName.add(new RoomDataModel("King Deluxe","404","382sqf","2","BDT 24,000 / US $300","wifi,swiming pool",R.drawable.kingdeluxe));
        roomName.add(new RoomDataModel("Queen Deluxe","405","382sq","2","BDT 24,000 / US $300","wifi,swiming pool",R.drawable.queen));
        roomName.add(new RoomDataModel("Triple Deluxe","406","382sq","3","BDT 24,000 / US $300","wifi,swiming pool",R.drawable.tripledeluxe));
        roomName.add(new RoomDataModel("Executive Suite King","407","569sqf","2","BDT 34,000 / US $425","wifi,swiming pool",R.drawable.rooms));
        roomName.add(new RoomDataModel("Royal Suite Deluxe","408","920sqf","4","BDT 51,600 / US $645","wifi,swiming pool",R.drawable.royal));
        roomName.add(new RoomDataModel("Presidential Suite (Raj Prashad)","409","1350sqf","4","BDT 77,600 / US $970","wifi,swiming pool",R.drawable.rajprasad));

       return  roomName;
    }
}
