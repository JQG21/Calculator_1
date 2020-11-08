package com.example.calculator_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    TextView textView ;
    Expression e ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.e1);
        textView = findViewById(R.id.t1);
         e = new Expression();
    }
    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.b1) {
            String infix = editText.getText().toString();
            String result = e.calculate(infix);
            textView.setText(result);
        }
    }
}