package com.awcode.cardviewlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.pic_1,"User 01", R.drawable.img01,2500));
        mlist.add(new item(R.drawable.pic_2,"User 02", R.drawable.img02,3500));
        mlist.add(new item(R.drawable.pic_3,"User 03", R.drawable.img03,5500));
        mlist.add(new item(R.drawable.pic_4,"User 04", R.drawable.img04,12500));
        mlist.add(new item(R.drawable.pic_5,"User 05", R.drawable.img05,22500));
        mlist.add(new item(R.drawable.pic_6,"User 01", R.drawable.img01,32500));
        mlist.add(new item(R.drawable.pic_7,"User 02", R.drawable.img02,12500));
        mlist.add(new item(R.drawable.pic_8,"User 03", R.drawable.img03,500));
        mlist.add(new item(R.drawable.pic_9,"User 04", R.drawable.img04,1500));
        mlist.add(new item(R.drawable.pic_10,"User 05", R.drawable.img05,6500));
        Adapter adapter = new Adapter(this,mlist);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
