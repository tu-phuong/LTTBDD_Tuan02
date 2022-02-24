package com.example.bai01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView edtName;
    TextView edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtName.getText().equals("")){
                    Toast.makeText(MainActivity.this,
                            "No thing to show", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(MainActivity.this,
                        edtName.getText(), Toast.LENGTH_SHORT).show();

                if(edtPassword.getText().equals("")){
                    Toast.makeText(MainActivity.this,
                            "No thing to show", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(MainActivity.this,
                        edtName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}