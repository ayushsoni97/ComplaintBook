package com.example.abhishek.abhi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class new_problems extends AppCompatActivity {


    EditText editText3;
    Button post;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_problems);


        editText3 = (EditText)findViewById(R.id.editText3);
        post = (Button)findViewById(R.id.post);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 intent = new Intent(new_problems.this,trending_problems.class);

                //intent.putExtra("description", editText3.toString());
               // intent.putExtra("intvariable",0);
                startActivity(intent);

                }
        });
        }

}
