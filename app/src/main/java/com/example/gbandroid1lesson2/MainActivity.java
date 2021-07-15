package com.example.gbandroid1lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private double calc=0.0;
    private String calcMemo="";
    private TextView textV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);
        textV=findViewById(R.id.textView);

    }

    public void button1_onClick(View view){

        calcMemo=calcMemo+"1";
        UndateTextView();
    }
    public void button2_onClick(View view){

        calcMemo=calcMemo+"2";
        UndateTextView();
    }
    public void button3_onClick(View view){

        calcMemo=calcMemo+"3";
        UndateTextView();
    }
    public void button4_onClick(View view){

        calcMemo=calcMemo+"4";
        UndateTextView();
    }
    public void button5_onClick(View view){

        calcMemo=calcMemo+"5";
        UndateTextView();
    }
    public void button6_onClick(View view){

        calcMemo=calcMemo+"6";
        UndateTextView();
    }
    public void button7_onClick(View view){

        calcMemo=calcMemo+"7";
        UndateTextView();
    }
    public void button8_onClick(View view){

        calcMemo=calcMemo+"8";
        UndateTextView();
    }public void button9_onClick(View view){

        calcMemo=calcMemo+"9";
        UndateTextView();
    }
    public void button0_onClick(View view){

        calcMemo=calcMemo+"0";
        UndateTextView();
    }
    public void button_point(View view){

        calcMemo=calcMemo+".";
        UndateTextView();
    }
    public void button_plus(View view){

        calcMemo=calcMemo+"+";
        UndateTextView();
    }
    public void button_minus(View view){

        calcMemo=calcMemo+"-";
        UndateTextView();
    }
    public void button_add(View view){

        calcMemo=calcMemo+"*";
        UndateTextView();
    }

    public void button_button_divide(View view){

        calcMemo=calcMemo+"/";
        UndateTextView();
    }

    private void UndateTextView(){
        textV.setText(String.valueOf(calcMemo));

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
    }
}