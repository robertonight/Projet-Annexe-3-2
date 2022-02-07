package com.example.projetannexe32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    EditText code;
    String passwd;
    String currentPass;
    String currentValue;
//    String input;
    Ecouteur ec;
//    EditText champResultat;
    ConstraintLayout parent;
//    Button temp;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent);
//        champResultat = findViewById(R.id.champResultat);

//        for (int i = 0; i < parent.getChildCount(); i++){
//            if (parent.getChildAt(i) instanceof Button){
//                parent.getChildAt(i).setOnClickListener(ec);
//            }
//        }
        passwd = "1939";
        currentPass = "";

        code = findViewById(R.id.champResultat);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);

        ec = new Ecouteur();
        b1.setOnClickListener(ec);
        b2.setOnClickListener(ec);
        b3.setOnClickListener(ec);
        b4.setOnClickListener(ec);
        b5.setOnClickListener(ec);
        b6.setOnClickListener(ec);
        b7.setOnClickListener(ec);
        b8.setOnClickListener(ec);
        b9.setOnClickListener(ec);
        b0.setOnClickListener(ec);
    }

    private class Ecouteur implements View.OnClickListener, com.example.projetannexe32.Ecouteur{
        @Override
        public void onClick(View v) {
//            temp = (Button) v;
//            input+=temp.getText();
//            champResultat.setText(input);
//            currentValue = "";
//            currentPass = "";
            if (v==b1)      currentValue = "1";
            else if (v==b2) currentValue = "2";
            else if (v==b3) currentValue = "3";
            else if (v==b4) currentValue = "4";
            else if (v==b5) currentValue = "5";
            else if (v==b6) currentValue = "6";
            else if (v==b7) currentValue = "7";
            else if (v==b8) currentValue = "8";
            else if (v==b9) currentValue = "9";
            else currentValue = "0";

            currentPass += currentValue;
            code.setText(currentPass);

            if (passwd.length() == currentPass.length()) {
                if (passwd.equals(currentPass))
                    parent.setBackgroundColor(Color.rgb(34,139,34));
                else parent.setBackgroundColor(Color.rgb(202,0,42));
                currentPass = "";
                code.setText("");
            }

        }
    }
}