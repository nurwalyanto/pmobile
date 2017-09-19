package com.bawal.p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView a=(TextView)findViewById(R.id.hw);
        Button p=(Button)findViewById(R.id.plus);
        Button m=(Button)findViewById(R.id.minus);
        //a.setText(String.valueOf(a.getTextSize()));
        p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // click handling code
                float bsr;
                bsr= a.getTextSize();
                //bsr+=10;
                a.setTextSize((bsr+4)/2);
            }
        });
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // click handling code
                float bsr;
                bsr= a.getTextSize();
                //bsr+=10;
                a.setTextSize((bsr-4)/2);
            }
        });
    }

}
