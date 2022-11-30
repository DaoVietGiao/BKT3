package com.daovietgiao.daovietgiao_bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TacPham extends AppCompatActivity {

    ListView listviewHuyCan;
    ArrayList<String> arrayCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewHuyCan = (ListView) findViewById(R.id.TacPhamListView);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("1.Tràng giang");
        arrayCourse.add("2.Đoàn thuyền đánh cá");
        arrayCourse.add("3.Ta viết bài thơ gọi biển về");
        arrayCourse.add("4.Ngậm ngùi");
        arrayCourse.add("5.Con chim chiền chiện");

        ArrayAdapter adapter = new ArrayAdapter(
                TacPham.this,
                android.R.layout.simple_expandable_list_item_1,
                arrayCourse);

        listviewHuyCan.setAdapter(adapter);

        listviewHuyCan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TacPham.this, ""+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}