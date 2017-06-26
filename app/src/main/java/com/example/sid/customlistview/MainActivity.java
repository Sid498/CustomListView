package com.example.sid.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data> mName;

    private ArrayAdapter mAdapter;
    private CustomAdapter mcustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvNameandNumber = (ListView) findViewById(R.id.lvNameandNumber);
        mName = new ArrayList<>();
        //adding data
        for (int i=1;i<10;i++) {
            Data data = new Data();
            data.setName("Name "+i);
            data.setNumber("PhoneNumber "+i);
            mName.add(data);
        }

        //setting the adapter to listvieew
        mcustomAdapter = new CustomAdapter(MainActivity.this,mName);
        lvNameandNumber.setAdapter(mcustomAdapter);

    }
}
