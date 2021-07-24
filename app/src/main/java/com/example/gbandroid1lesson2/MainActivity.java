package com.example.gbandroid1lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private double calc = 0.0;
    private String calcMemo1 = "";
    private String calcMemo2 = "";
    private int Casess;
    private TextView textV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);
        textV = findViewById(R.id.textView);

    }

    public void button1_onClick(View view) {

        calcMemo1 = calcMemo1 + "1";
        UndateTextView();
    }

    public void button2_onClick(View view) {

        calcMemo1 = calcMemo1 + "2";
        UndateTextView();
    }

    public void button3_onClick(View view) {

        calcMemo1 = calcMemo1 + "3";
        UndateTextView();
    }

    public void button4_onClick(View view) {

        calcMemo1 = calcMemo1 + "4";
        UndateTextView();
    }

    public void button5_onClick(View view) {

        calcMemo1 = calcMemo1 + "5";
        UndateTextView();
    }

    public void button6_onClick(View view) {

        calcMemo1 = calcMemo1 + "6";
        UndateTextView();
    }

    public void button7_onClick(View view) {

        calcMemo1 = calcMemo1 + "7";
        UndateTextView();
    }

    public void button8_onClick(View view) {

        calcMemo1 = calcMemo1 + "8";
        UndateTextView();
    }

    public void button9_onClick(View view) {

        calcMemo1 = calcMemo1 + "9";
        UndateTextView();
    }

    public void button0_onClick(View view) {

        calcMemo1 = calcMemo1 + "0";
        UndateTextView();
    }

    public void button_point(View view) {

        calcMemo1 = calcMemo1 + ".";
        UndateTextView();
    }

    public void button_plus(View view) {
        Casess = 1;
        calcMemo2 = calcMemo1;
        calcMemo1 = "";
        UndateTextView();
    }

    public void button_minus(View view) {
        Casess = 2;
        calcMemo2 = calcMemo1;
        calcMemo1 = "";
        UndateTextView();
    }

    public void button_add(View view) {
        Casess = 3;
        calcMemo2 = calcMemo1;
        calcMemo1 = "";
        UndateTextView();
    }

    public void button_button_divide(View view) {
        Casess = 4;
        calcMemo2 = calcMemo1;
        calcMemo1 = "";
        UndateTextView();
    }

    public void button_equal(View view) {
        switch (Casess) {
            case 1:
                calc = Double.parseDouble(calcMemo1) + Double.parseDouble(calcMemo2);
                break;
            case 2:
                calc = Double.parseDouble(calcMemo1) - Double.parseDouble(calcMemo2);
                break;
            case 3:
                calc = Double.parseDouble(calcMemo1) * Double.parseDouble(calcMemo2);
                break;
            case 4:
                calc = Double.parseDouble(calcMemo1) / Double.parseDouble(calcMemo2);
                break;
        }
        calcMemo1 = "";
        ResultTextView();
    }

    private void UndateTextView() {
        textV.setText(String.valueOf(calcMemo1));
    }

    private void ResultTextView() {
        textV.setText(String.valueOf(calc));
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