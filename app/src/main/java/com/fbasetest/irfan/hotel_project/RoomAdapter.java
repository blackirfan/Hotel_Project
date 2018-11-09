package com.fbasetest.irfan.hotel_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RoomAdapter extends ArrayAdapter {

    public Context context;
    public int resID;

    ArrayList<RoomDataModel> dataList;



    public RoomAdapter( Context context, int resource, ArrayList<RoomDataModel> dataList) {
        super(context, resource, dataList);


        this.context = context;
        this.dataList = dataList;
        this.resID =resource;

    }



    @Override
    public int getCount() {
        return dataList.size();
    }

    public  class ViewHolder{
        TextView tvName, tvSize, tvRoomNumber,tvPrice,tvPersonCapasity,tvFacilities;
        ImageView iv_picture;
    }


    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder;

        if(view == null){

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resID,null);
            viewHolder = new ViewHolder();

            viewHolder.tvName = view.findViewById(R.id.tv_name);
            viewHolder.tvSize = view.findViewById(R.id.tv_size);
            viewHolder.tvRoomNumber= view.findViewById(R.id.tv_room_number);
            viewHolder.tvPrice = view.findViewById(R.id.tv_price);
            viewHolder.tvPersonCapasity = view.findViewById(R.id.tv_person_capacity);
            viewHolder.tvFacilities = view.findViewById(R.id.tv_extaFacilities);
            viewHolder.iv_picture = view.findViewById(R.id.iv_pic);


            view.setTag(viewHolder);




        }else{


            viewHolder = (ViewHolder)view.getTag();
        }

        RoomDataModel roomModel = dataList.get(position);
        viewHolder.tvName.setText("NAME : "+roomModel.getRoom_name());
        viewHolder.tvSize.setText("Size : "+roomModel.getRoom_size());
        viewHolder.tvRoomNumber.setText("Room Number : "+roomModel.getRoom_number());
        viewHolder.tvPrice.setText("PRICE : " +roomModel.getPrice());
        viewHolder.tvPersonCapasity.setText(" "+roomModel.getRoom_person_capacity());
        viewHolder.tvFacilities.setText("Extra Facility : "+roomModel.getExtra_facilities());
        Glide.with(context).load(roomModel.getRoom_image()).into(viewHolder.iv_picture);












        if(position == 1){


            viewHolder.tvName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Clicked On Phone", Toast.LENGTH_SHORT).show();
                }
            });


        }else if(position ==0){

            viewHolder.tvName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "You click a wrong number", Toast.LENGTH_SHORT).show();
                }
            });
        }

        return view;





















    }
}
