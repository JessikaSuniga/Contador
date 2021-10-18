package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCounter;
    private TextView txtCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCounter = findViewById(R.id.btnCounter);
        txtCounter = findViewById(R.id.txtCounter);

        btnCounter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        RunTask task = new RunTask(btnCounter, txtCounter);
        if (view.getId() == R.id.btnCounter){
            task.execute();
        }
    }
}