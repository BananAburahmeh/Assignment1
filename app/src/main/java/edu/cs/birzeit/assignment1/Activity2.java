package edu.cs.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        String address = intent.getStringExtra("Address");
        String phone = intent.getStringExtra("Phone");
//        String gender = intent.getStringExtra("Gender");
//        String age = intent.getStringExtra("Age");
        String hobbies = intent.getStringExtra("Hobbies");
        String language = intent.getStringExtra("Languages");


        TextView summary = findViewById(R.id.txtSum);
        summary.setText("Name: "+name+ "\nEmail: "+email +"\nAddress: "+address+"\nPhone: "+phone+
                "\nGender: "+"\nAge: "+"\nHobbies: "+hobbies+"\nLanguage: "+language+"");




    }
}