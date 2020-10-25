package com.lgh.player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.lgh.player.databinding.ActivityMainBinding;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        Intent intent = getIntent();
        if (intent.getData() != null){
            try {
                mainBinding.player.setDataSource(intent.getData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}