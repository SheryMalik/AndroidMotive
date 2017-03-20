package com.example.yousaafsnaaa.androidmotive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        t1 = (TextView)findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                t1.setText("Hello World");
            }
        });

        // this is comment just to test push
    }
}
