package com.example.recycledview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    MainAdapter adapter;
    ArrayList<ItemModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.rv);
        adapter = new MainAdapter();

        recycler.setAdapter(adapter);

        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recycler.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0, new ItemModel(1,"Messi"));
        list.add(1, new ItemModel(2,"Ronaldo"));
        list.add(2, new ItemModel(3,"Do Caprio"));
        list.add(3, new ItemModel(4,"Belucci"));
        list.add(4, new ItemModel(5,"Hulk"));
        list.add(5, new ItemModel(6,"Spider Man"));
        list.add(6, new ItemModel(7,"Iron"));
        list.add(7, new ItemModel(8, "Messi"));

        adapter.addText(list);

    }
}