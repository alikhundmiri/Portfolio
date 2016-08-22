package com.awesome.alikhundmiri.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this method below is in oncreate, which means it can be done only once.
        // i dont remember exactly how to set on create method seperately. i did this from what i remember i did previously, few monthy ago


        //refered tutorialspoint to see how to setup a button.

        // problem encountered: im using strings to store the apps names, and calling it via reference in here for the Toast, and in XML for display
        // but i cant see the String in the Toast!!

 // FIRST I TRIED THIS. But it didnt show the app name from the string resource. "this button will launch my 2131099669 app!"
/*
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "this button will launch my " + R.string.button_1 +" app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );
*/

// THEN I USED THIS

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "This button will launch my Stock Hawks app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "This button will launch my Built it Bigger app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );


        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );

        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );


        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }

}