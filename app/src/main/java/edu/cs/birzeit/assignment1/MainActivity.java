package edu.cs.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText edtName;
    private EditText edtEmail;
    private EditText edtAddress;
    private EditText edtPhone;
//    private RadioButton btnMail;
//    private RadioButton btnFemail;
//    private RadioButton age1;
//    private RadioButton age2;
//    private RadioButton age3;
    private EditText edtHobbies;
    private RadioGroup rdg;
    private RadioGroup rdg2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtAddress = findViewById(R.id.edtAddress);
        edtPhone = findViewById(R.id.edtPhone);
//        RadioGroup rdg = (RadioGroup) findViewById(R.id.rdg);
//        RadioGroup rdg2 = (RadioGroup) findViewById(R.id.rdg2);
        edtHobbies = findViewById(R.id.edtHobbies);
        spinner = (Spinner) findViewById(R.id.spinner);
        PopulateSpinner();
    }
    private void PopulateSpinner() {
        ArrayList<String> data = new ArrayList<>();
        data.add("English");
        data.add("Arabic");
        data.add("Spanish");
        data.add("French");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, data  );


        spinner.setAdapter(adapter);
    }


    public void btnSave_onClick(View view) {

        String name = edtName.getText().toString();
        String email = edtEmail.getText().toString();
        String address = edtAddress.getText().toString();
        String phone = edtPhone.getText().toString();
//        String gender = ((RadioButton)findViewById(rdg.getCheckedRadioButtonId() )).getText().toString();
//        String age =((RadioButton)findViewById(rdg2.getCheckedRadioButtonId() )).getText().toString();
        String hobbies = edtHobbies.getText().toString();
        String languages = spinner.getSelectedItem().toString();


        Intent intent = new Intent(this, Activity2.class );
        intent.putExtra("Name" , name);
        intent.putExtra("Email" , email);
        intent.putExtra("Address" , address);
        intent.putExtra("Phone" , phone);
//        intent.putExtra("Gender", gender );
//        intent.putExtra("Age", age);
        intent.putExtra("Hobbies" , hobbies);
        intent.putExtra("Languages",languages);
        startActivity(intent);


    }
}