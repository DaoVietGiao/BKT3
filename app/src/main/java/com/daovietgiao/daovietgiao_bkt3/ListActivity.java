package com.daovietgiao.daovietgiao_bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView lvAuthor;
    ArrayList<Author> arrayAuthor;
    AuthorAdapter adapter;

    private EditText User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        AnhXa();

        adapter = new AuthorAdapter(this, R.layout.author_line, arrayAuthor);
        lvAuthor.setAdapter(adapter);

        lvAuthor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = lvAuthor.getItemAtPosition(position);
            }
        });
    }

    private void AnhXa(){
        lvAuthor = (ListView) findViewById(R.id.AuthorListView);
        arrayAuthor = new ArrayList<>();

        arrayAuthor.add(new Author(R.drawable.au1,"Huy Cận","22/01/1917","19/02/2005"));
        arrayAuthor.add(new Author(R.drawable.au2,"Mạc Ngôn","17/02/1995"," "));
        arrayAuthor.add(new Author(R.drawable.au3,"Hemingway","21/07/1899","2/07/1961"));
        arrayAuthor.add(new Author(R.drawable.au4,"Shakespeare","23/04/1564","23/04/1616"));
        arrayAuthor.add(new Author(R.drawable.au5,"Tô Hoài","27/09/1920","6/07/2014"));
    }

}