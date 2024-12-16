package com.example.android2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Track> trackList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            trackList.add(new Track("No Hay Ley " + i, "Kali Uchis"));
        }
        TrackAdapter adapter = new TrackAdapter(trackList);
        recyclerView.setAdapter(adapter);

    }
}