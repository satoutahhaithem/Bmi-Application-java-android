package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView imageView =findViewById(R.id.imageView);
        TextView textView1=findViewById(R.id.textView1);
        TextView textView2=findViewById(R.id.textView2);
        TextView textView3=findViewById(R.id.textViewAge);
        Intent intent = getIntent();
        float weight = Float.valueOf(intent.getStringExtra("weight"));
        float size = Float.valueOf(intent.getStringExtra("size"));
        float age = Float.valueOf(intent.getStringExtra("age"));
        System.out.println(weight);
        System.out.println(size);
        System.out.println(age);
        float bmi= weight /(size * size);
        System.out.println(bmi);
        textView3.setText("You Age is "+intent.getStringExtra("age"));
        if (bmi>=40){
            textView1.setText("Massive");
            imageView.setImageResource(R.drawable.fat);
        }
        else if (bmi<40 && bmi>=35) {
            imageView.setImageResource(R.drawable.fat);
            textView1.setText("Severe");
        }else if (bmi<35 && bmi>=30) {
            imageView.setImageResource(R.drawable.obsety);
            textView1.setText("modere");
        }else if (bmi<30 && bmi>=25) {
            imageView.setImageResource(R.drawable.overweight);
            textView1.setText("supoids");
        }else if (bmi<25 && bmi>=18.5) {
            imageView.setImageResource(R.drawable.normal);
            textView1.setText("normal");
        }else {
            textView1.setText("Famine");
            imageView.setImageResource(R.drawable.famine);
        }

        textView2.setText("You Bmi is "+String.valueOf(bmi));







    }
}