package com.jinklepancholi.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImagesBitMaps();
    }
    private void initImagesBitMaps(){

//        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Trondheim");

        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Portugal");

        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Rocky Mountain National Park");


        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Mahahual");

        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://picsum.photos/id/237/200/300");
        mNames.add("Austrailia");

        mImageUrls.add("https://picsum.photos/id/237/200/300");

        mNames.add("Washington");

        initRecyclerView();
    }

    private void initRecyclerView(){
//        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( mNames, mImageUrls,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}