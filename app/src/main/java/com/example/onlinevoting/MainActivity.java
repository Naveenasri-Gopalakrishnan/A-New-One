package com.example.onlinevoting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtFirst;
    private TextView txtSecond;

    private Button btnFirst;
    private Button btnSecond;

    private int scoreFirst = 0;
    private int scoreSecond = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtFirst = (TextView) findViewById(R.id.txtFirst);
        txtSecond = (TextView) findViewById(R.id.txtSecond);


        btnFirst = (Button) findViewById(R.id.btnFirst);
        btnSecond = (Button) findViewById(R.id.btnSecond);


        txtFirst.setText(String.valueOf(0));
        txtSecond.setText(String.valueOf(0));


        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreFirst++;
                txtFirst.setText(String.valueOf(scoreFirst));
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreSecond++;
                txtSecond.setText(String.valueOf(scoreSecond));
            }
        });
    }
}
