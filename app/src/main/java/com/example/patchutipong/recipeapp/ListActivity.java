package com.example.patchutipong.recipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.ListView;
import java.util.Arrays;

public class ListActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ListView listViewHandler=(ListView)findViewById(R.id.usefulList);
        String[] menuItems={"menuItem 2","menuItem 3","menuItem 1","menuItem 2","menuItem 3","menuItem 1","menuItem 2","menuItem 3","menuItem 1","menuItem 2","menuItem 3"};
        arrayList = new ArrayList<>(Arrays.asList(menuItems));
        adapter = new ArrayAdapter<String>(this,R.layout.listitem,R.id.textItem,arrayList);
        listViewHandler.setAdapter(adapter);

    }

}