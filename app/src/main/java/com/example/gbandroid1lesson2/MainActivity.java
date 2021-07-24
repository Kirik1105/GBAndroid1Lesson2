package com.example.gbandroid1lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.radiobutton.MaterialRadioButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private double calc = 0.0;
    private String calcMemo1 = "";
    private String calcMemo2 = "";
    private int Casess;
    private TextView textV;

    // Имя настроек
    private static final String NameSharedPreference = "LOGIN";

    // Имя параметра в настройках


    private static final String appTheme = "APP_THEME";
    private static final int MyCoolCodeStyle = 0;
    private static final int AppThemeLightCodeStyle = 1;
    private static final int AppThemeCodeStyle = 2;
    private static final int AppThemeDarkCodeStyle = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Устанавливать тему надо только до установки макета активити
        setTheme(getAppTheme(R.style.MyCoolStyle));
        setContentView(R.layout.calc_layout);
        textV = findViewById(R.id.textView);
        initThemeChooser();
    }

    // Инициализация радиокнопок
    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMyCoolStyle),
                MyCoolCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark),
                AppThemeDarkCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLight),
                AppThemeLightCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLightDarkAction),
                AppThemeCodeStyle);
        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(MyCoolCodeStyle))).setChecked(true);
    }

    // Все инициализации кнопок очень похожи, поэтому создадим метод для переиспользования
    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // сохраним настройки
                setAppTheme(codeStyle);
                // пересоздадим активити, чтобы тема применилась
                recreate();
            }
        });
    }

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    // Чтение настроек, параметр «тема»
    private int getCodeStyle(int codeStyle) {
        // Работаем через специальный класс сохранения и чтения настроек
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        //Прочитать тему, если настройка не найдена - взять по умолчанию
        return sharedPref.getInt("AppTheme", codeStyle);
    }

    // Сохранение настроек
    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        // Настройки сохраняются посредством специального класса editor.
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("AppTheme", codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle) {
            case AppThemeCodeStyle:
                return R.style.AppTheme;
            case AppThemeLightCodeStyle:
                return R.style.AppThemeLight;
            case AppThemeDarkCodeStyle:
                return R.style.AppThemeDark;
            default:
                return R.style.MyCoolStyle;
        }
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