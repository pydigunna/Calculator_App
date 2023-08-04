package com.example.calculator11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   Button buttonAdd, buttonSub, buttonMul, buttonDiv;
   EditText editText1, editText2;
   TextView textView;
   int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd =findViewById(R.id.btn_add);
        buttonSub =findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv =findViewById(R.id.btn_div);
        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }
   public int getIntFromEditText(EditText editText){
       if(editText.getText().toString().equals("")){
           Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
           return 0;
       }else
       return Integer.parseInt(editText.getText().toString()) ;
   }
    @Override
    public void onClick(View view) {
     num1=getIntFromEditText(editText1);
     num2=getIntFromEditText(editText2);
     if(view.getId()==R.id.btn_add){
         textView.setText("answer:"+(num1+num2));
     }
     else if(view.getId()==R.id.btn_sub){
         textView.setText("answer:"+(num1-num2));
     }
     else if(view.getId()==R.id.btn_mul){
         textView.setText("answer:"+(num1*num2));
     }
     else{
         textView.setText("answer:"+((float)num1/(float)num2));
     }
    }
}