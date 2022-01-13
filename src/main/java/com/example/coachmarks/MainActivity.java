package com.example.coachmarks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoachMarker coach = findViewById(R.id.coach);
        coach.addText("Här hittar du informationen till xxx", 100, 900);
        coach.addText("Denna swtich ska göra xxxx", 150, 1600);

    }
}
