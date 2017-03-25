package com.example.abhishek.abhi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import static android.widget.Toast.*;


public class trending_problems extends Activity
{
    //public static int k=-1;


    //public static void setK(int k) {
     //   trending_problems.k = k + 1;
    //}

    private TextSwitcher mSwitcher;
    Button btnNext;
    Button prvbtn;
    //Intent intent = getIntent();
    //int intValue = intent.getIntExtra("intvariable", 0);
    //Bundle bundle = intent.getExtras();
    //String description = bundle.getString("description");
    // Array of String to Show In TextSwitcher
    //String  textToShow[] = intent.getStringArrayExtra("description");
    // Array of String to Show In TextSwitcher
      String textToShow[]={"problem 1","problem 2","problem 3","problem 4","problem 5","problem 6"};


    int messageCount=textToShow.length;
    // to keep current Index of text
    int currentIndex=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {



        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_trending_problems);
   //     Toast.makeText(this, description, Toast.LENGTH_SHORT).show();
        // get The references
        btnNext=(Button)findViewById(R.id.buttonNext);
        mSwitcher = (TextSwitcher) findViewById(R.id.trendingproblems);

        // Set the ViewFactory of the TextSwitcher that will create TextView object when asked
        mSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {
                // TODO Auto-generated method stub
                // create new textView and set the properties like clolr, size etc
                TextView myText = new TextView(trending_problems.this);
                myText.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText.setTextSize(36);
                myText.setTextColor(Color.BLUE);
                return myText;
            }
        });

        // Declare the in and out animations and initialize them
        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        // set the animation type of textSwitcher
        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);

        // ClickListener for NEXT button
        // When clicked on Button TextSwitcher will switch between texts
        // The current Text will go OUT and next text will come in with specified animation
        btnNext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                currentIndex++;
                // If index reaches maximum reset it
                if(currentIndex==messageCount)
                    currentIndex=0;
                //mSwitcher.setText(description);
                mSwitcher.setText(textToShow[currentIndex]);
            }
        });

       /* prvbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (currentIndex==0)
                    currentIndex=messageCount;
                currentIndex--;
                mSwitcher.setText(textToShow[currentIndex]);
            }
        });
*/
    }
}
