package com.example.saket.sharedprefrences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.Map;

public class contact extends AppCompatActivity {
    ExpandableListView expandableListView;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        expandableListView=(ExpandableListView)findViewById(R.id.expandable);
        preferences=getSharedPreferences("contact",MODE_PRIVATE);
        Map<String,Integer> map=(Map<String,Integer>)preferences.getAll();


        expandableListView.setAdapter();

    }
}
