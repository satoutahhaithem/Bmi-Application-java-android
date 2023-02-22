package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String weight;
    private String size;
    private String age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtTextWeight= findViewById(R.id.edtTxtWeight);
        EditText edtTextSize= findViewById(R.id.edtTxtSize);
        EditText edtTextAge= findViewById(R.id.edtTxtAge);
        Button button =findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("haithem");
                System.out.println(weight = edtTextWeight.getText().toString());
                System.out.println(size = edtTextSize.getText().toString());
                System.out.println(age = edtTextAge.getText().toString());
                Intent intent =new Intent(MainActivity.this,Result.class);
                intent.putExtra("weight",weight);
                intent.putExtra("size",size);
                intent.putExtra("age",age);
                startActivity(intent);
            }
        });
    }
//    public void Submit(View view) {
//        Intent intent =new Intent(MainActivity.this,Result.class);
//        intent.putExtra("weight",weight);
//        intent.putExtra("size",size);
//        startActivities(intent);
//    }

}