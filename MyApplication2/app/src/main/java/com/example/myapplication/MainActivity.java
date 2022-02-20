package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private Integer counter2 = 1000;

    Button plus_ruble;
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus_ruble = (Button) findViewById(R.id.plus_ruble);
        balance = (TextView) findViewById(R.id.balance);
        Plus_ruble();
        TextView counterView = (TextView) findViewById(R.id.balance);
        counterView.setText(counter.toString());

    }


        void Plus_ruble() {
            plus_ruble.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    counter += counter2;
                    balance.setText(counter + "");
                }
            });

        }
    }