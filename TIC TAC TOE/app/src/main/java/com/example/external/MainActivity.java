package com.example.external;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import kotlinx.coroutines.Delay;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    int flag = 0;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        btn3 = findViewById(R.id.Btn3);
        btn4 = findViewById(R.id.Btn4);
        btn5 = findViewById(R.id.Btn5);
        btn6 = findViewById(R.id.Btn6);
        btn7 = findViewById(R.id.Btn7);
        btn8 = findViewById(R.id.Btn8);
        btn9 = findViewById(R.id.Btn9);
    }

    public void check(View view) {
        Button btc = (Button) view;
        if(btc.getText().toString().equals("")){
        count++;
        if (flag == 0) {
            btc.setText("X");
            flag = 1;
        } else {
            btc.setText("O");
            flag = 0;
        }

        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b1+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b4+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b7+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b1+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b2+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b3+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b1+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            } else if (b7.equals(b5) && b5.equals(b3) && !b3.equals("")) {
                Toast.makeText(this,"CONGRATS WINNER IS "+b3+"!!!", Toast.LENGTH_SHORT).show();
                ngame();
            }else if(count==9){
                Toast.makeText(this,"THIS GAME IS DRAW",Toast.LENGTH_SHORT).show();
                ngame();
            }
        }

    }
    }
    public void ngame(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count=0;
                flag=0;
            }
        },2800);

    }

}
