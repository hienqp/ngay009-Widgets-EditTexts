package com.hienqp.edittexts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // KHAI BAO
    EditText edtNoiDung;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ANH XA
        edtNoiDung = (EditText) findViewById(R.id.editTextUserName);
        btnClick = (Button) findViewById(R.id.buttonClick);

//        edtNoiDung.setText("Hello World !!!");

        // LOGIC CODE
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noiDung = edtNoiDung.getText().toString();
                Toast.makeText(MainActivity.this, noiDung, Toast.LENGTH_LONG).show();
            }
        });
    }
}