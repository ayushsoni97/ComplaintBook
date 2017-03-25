package com.example.abhishek.abhi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button NPbtn;
    Button TDbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NPbtn = (Button) findViewById(R.id.NPbtn);
        TDbtn = (Button) findViewById(R.id.TDbtn);
        TDbtn.setOnClickListener(this);
        NPbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.NPbtn:

                startActivity(new Intent(MainActivity.this, new_problems.class));
                break;

            case R.id.TDbtn:

                startActivity(new Intent(MainActivity.this, trending_problems.class));
                break;
        }

    }
}
