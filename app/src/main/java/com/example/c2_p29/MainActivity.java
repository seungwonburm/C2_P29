package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton alpha, bravo, charlie, delta, echo, foxtrot, golf, hotel, india, juliet, kilo, lima, mike;
    Button plus, minus, enter, clear;
    TextView totalText, quantityText;
    int calories[] = {200, 100, 300, 150, 400, 10, 200, 700, 35, 245, 700, 35, 245};
    Boolean flag[] = new Boolean[calories.length];
    int total = 0, quantity=0, totalStore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alpha = (RadioButton)findViewById(R.id.A);
        bravo = (RadioButton) findViewById(R.id.B);
        charlie = (RadioButton) findViewById(R.id.C);
        delta = (RadioButton) findViewById(R.id.D);
        echo = (RadioButton) findViewById(R.id.E);
        foxtrot = (RadioButton) findViewById(R.id.F);
        golf = (RadioButton) findViewById(R.id.G);
        hotel = (RadioButton) findViewById(R.id.H);
        india = (RadioButton) findViewById(R.id.I);
        juliet = (RadioButton) findViewById(R.id.J);

        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        enter = (Button)findViewById(R.id.enter);
        clear = (Button)findViewById(R.id.clear);

        totalText = (TextView)findViewById(R.id.total);
        quantityText = (TextView)findViewById(R.id.quantity);

        for (int i=0; i< flag.length; i++){
            flag[i] = false;
        }

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity+=1;
                quantityText.setText(quantity+"");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity ==0){
                    quantityText.setText("0");
                }else{
                    quantity -=1;
                    quantityText.setText(quantity+"");
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i=0; i< calories.length; i++){
                    if(flag[i] == true){
                        total += calories[i];
                        flag[i] =false;
                    }
                }
                int finalAnswer=0;
                finalAnswer+=total * quantity;
                total =0;
                totalStore += finalAnswer;

                totalText.setText(totalStore+"");


                alpha.setChecked(false);
                bravo.setChecked(false);
                charlie.setChecked(false);
                delta.setChecked(false);
                echo.setChecked(false);
                foxtrot.setChecked(false);
                golf.setChecked(false);
                hotel.setChecked(false);
                india.setChecked(false);
                juliet.setChecked(false);


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total =0;
                quantity=0;
                totalStore=0;
                quantityText.setText("Quantity");
                totalText.setText("Total");
                alpha.setChecked(false);
                bravo.setChecked(false);
                charlie.setChecked(false);
                delta.setChecked(false);
                echo.setChecked(false);
                foxtrot.setChecked(false);
                golf.setChecked(false);
                hotel.setChecked(false);
                india.setChecked(false);
                juliet.setChecked(false);
                for(int i=0; i<flag.length; i++){
                    flag[i]=false;
                }
            }
        });

    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.A:
                if (checked) {
                    flag[0]=true;
                }
                break;

            case R.id.B:
                if (checked) {
                    flag[1]=true;
                }
                break;
            case R.id.C:
                if (checked) {
                    flag[2]=true;
                }

                break;
            case R.id.D:
                if (checked) {
                    flag[3]=true;
                }

                break;
            case R.id.E:
                if (checked) {
                    flag[4]=true;
                }

                break;
            case R.id.F:
                if (checked) {
                    flag[5]=true;
                }

                break;
            case R.id.G:
                if (checked) {
                    flag[6]=true;
                }

                break;
            case R.id.H:
                if (checked) {
                    flag[7]=true;
                }

                break;
            case R.id.I:
                if (checked) {
                    flag[8]=true;
                }

                break;
            case R.id.J:
                if (checked) {
                    flag[9] = true;
                }
                break;

        }
    }
}