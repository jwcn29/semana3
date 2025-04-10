package com.example.colorlistapp;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ColorAdapter adapter;
    private List<ColorItem> colorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        colorList = new ArrayList<>();

        colorList.add(new ColorItem("Blue", "#2196F3", Color.parseColor("#2196F3")));
        colorList.add(new ColorItem("Indigo", "#3F51B5", Color.parseColor("#3F51B5")));
        colorList.add(new ColorItem("Red", "#F44336", Color.parseColor("#F44336")));
        colorList.add(new ColorItem("Green", "#4CAF50", Color.parseColor("#4CAF50")));
        colorList.add(new ColorItem("Orange", "#FF9800", Color.parseColor("#FF9800")));
        colorList.add(new ColorItem("Grey", "#607D8B", Color.parseColor("#607D8B")));
        colorList.add(new ColorItem("Amber", "#009688", Color.parseColor("#009688")));
        colorList.add(new ColorItem("Deep Purple", "#673AB7", Color.parseColor("#673AB7")));

        adapter = new ColorAdapter(this, colorList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
