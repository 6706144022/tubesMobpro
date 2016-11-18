package com.example.asus.smartphysic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.RuntimeException;

/**
 * Created by asus on 11/13/2016.
 */
public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ImageButton btn = (ImageButton) findViewById(R.id.arusListrik);

        if (btn != null) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Menu.this, "test", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Menu.this, FisikaArusListrik.class));
                }
            });


        }


    }
}

