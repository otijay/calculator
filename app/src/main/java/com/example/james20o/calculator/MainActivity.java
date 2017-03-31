package com.example.james20o.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
       private String display = "";
         private String currentOperator = "";
         private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView)findViewById(R.id.textView);
                 screen.setText(display);
    }
    private void updateScreen(){
                 screen.setText(display);
             }
    public void onClickNumber(View v){
                 if(result != ""){
                        clear();
                         updateScreen();
                     }
                 Button b = (Button) v;
                 display += b.getText();
                 updateScreen();
             }

             public void onClickOperator(View v) {
                 if (display == "") return;


                 Button b = (Button) v;


                 if (result != "") {
                     String _display = result;
                     clear();
                     display = _display;
                 }
             }
             private void clear(){
                 display = "";
                 currentOperator = "";
                 result = "";
             }


             public void onClickClear(View v){
                 clear();
                 updateScreen();
             }

        }
