package com.example.sabiranjevera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText br1;
    EditText br2;
    EditText br3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        br1 = (EditText) findViewById(R.id.prvibroj);
        br2 = (EditText) findViewById(R.id.drugibroj);
        br3 = (EditText) findViewById(R.id.resenje);

    }
    public void saberi(View view)
    {
        String t1= br1.getText().toString();
        int broj1=Integer.parseInt(t1);
        String t2= br2.getText().toString();
        int broj2=Integer.parseInt(t2);
        int res = broj1+broj2;

        br3.setText(String.valueOf(res));
    }
}