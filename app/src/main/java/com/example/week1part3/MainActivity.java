package com.example.week1part3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tw;
    EditText et;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tw = (TextView)findViewById(R.id.answer_box);
        et = (EditText)findViewById(R.id.editTextNumber);
        et2 = (EditText)findViewById(R.id.editTextNumber2);
    }

    public void addBtn(View view) {
        double firstNum;
        double secondNum;
        try {
            firstNum = Double.parseDouble(et.getText().toString());
            secondNum = Double.parseDouble(et2.getText().toString());
        } catch(Exception e) {
            tw.setText("Error!");
            return;
        }
        tw.setText(String.valueOf(firstNum + secondNum));
    }

    public void multiplyBtn(View view) {
        double firstNum;
        double secondNum;
        try {
            firstNum = Double.parseDouble(et.getText().toString());
            secondNum = Double.parseDouble(et2.getText().toString());
        } catch(Exception e) {
            tw.setText("Error!");
            return;
        }
        tw.setText(String.valueOf(firstNum * secondNum));
    }

    public void clearBtn(View view) {
        tw.setText("");
        et.setText("");
        et2.setText("");
    }
}