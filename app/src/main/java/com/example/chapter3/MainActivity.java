package com.example.chapter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        double costperticket=79.9;
        final int[] numberoftickets = new int[1];
        String groupchoice;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets= (EditText)findViewById(R.id.txtTickets);
        final Spinner group= (Spinner)findViewById(R.id.spinner);
        Button cost = (Button)findViewById(R.id.button);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView txtv = (TextView)findViewById(R.id.textView);
            @Override
            public void onClick(View v) {
                numberoftickets[0] =Integer.parseInt(tickets.getText().toString());

            }
        });
    }
}