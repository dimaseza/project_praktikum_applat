package com.daivers.dummyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPraktikum;
    private ArrayList<Praktikum> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPraktikum = findViewById(R.id.rv_example);
        rvPraktikum.setHasFixedSize(true);

        list.addAll(PraktikumData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPraktikum.setLayoutManager(new LinearLayoutManager(this));
        ListPraktikumAdapter listPraktikumAdapter = new ListPraktikumAdapter(list);
        rvPraktikum.setAdapter(listPraktikumAdapter);
    }
}