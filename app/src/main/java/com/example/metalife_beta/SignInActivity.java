package com.example.metalife_beta;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.funcionalities.SplashScreen;
import com.example.metalife_beta.funcionalities.maps;


public class SignInActivity extends AppCompatActivity {

    Button button1;
    EditText name, email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        name = findViewById(R.id.editText200);
        email = findViewById(R.id.editText201);
        password = findViewById(R.id.editText203);


        button1 = findViewById(R.id.button4);

        TextView SignUpTextView = findViewById(R.id.textView15);

        SignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("TextInput1", "Nombre:" + name.getText().toString());
                Log.v("TextInput2", "Correo:" + email.getText().toString());
                Log.v("TextInput3", "Contraseña:" + password.getText().toString());

                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                intent.putExtra("name", name.getText().toString());
                startActivity(intent);
            }
        });
    }
}
