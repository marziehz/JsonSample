package com.example.iran.jsonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Repository> list = QueryUtils.getRepositoryFromJson();
        RepositoryAdapter adapter = new RepositoryAdapter(this,list);
        ListView listview = findViewById(R.id.listview);
        listview.setAdapter(adapter);


    }
}
