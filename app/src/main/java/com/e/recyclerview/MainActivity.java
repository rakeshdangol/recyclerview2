package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    restroitem[] restroitems = new restroitem[6];
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.act);

        restroitems[0] = new restroitem("MoMo","Rs.100",R.drawable.ic_launcher_foreground);
        restroitems[1] = new restroitem("MoMo","Rs.100",R.drawable.ic_launcher_foreground);
        restroitems[2] = new restroitem("MoMo","Rs.100",R.drawable.ic_launcher_foreground);
        restroitems[3] = new restroitem("MoMo","Rs.100",R.drawable.ic_launcher_foreground);
        restroitems[4] = new restroitem("MoMo","Rs.100",R.drawable.ic_launcher_foreground);
        restroitems[5] = new restroitem("MoMo","Rs.100",R.drawable.ic_launcher_foreground);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        recyclerView.setAdapter(new RecyclerAdapter(restroitems));
    }
}
