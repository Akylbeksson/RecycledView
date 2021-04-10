package com.example.recycledview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView tv;
    TextView tv1;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv_name);
        tv1 = itemView.findViewById(R.id.tv_count);

    }
    public void onBind(ItemModel data){
        tv.setText(data.name);
        tv1.setText(String.valueOf(data.count));
    }

}
