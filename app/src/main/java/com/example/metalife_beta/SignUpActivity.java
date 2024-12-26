package com.example.metalife_beta;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    Button button1;
    EditText name, email, password, phone, password_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.singup_layout);

        name = findViewById(R.id.editText204);
        email = findViewById(R.id.editText205);
        phone = findViewById(R.id.editText206);
        password = findViewById(R.id.editText207);
        password_again = findViewById(R.id.editText208);

        button1 = findViewById(R.id.button5);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("TextInput1", "Nombre:" + name.getText().toString());
                Log.v("TextInput2", "Correo:" + email.getText().toString());
                Log.v("TextInput3", "Movil:" + phone.getText().toString());
                Log.v("TextInput3", "Contraseña:" + password.getText().toString());
                Log.v("TextInput3", "Contraseña de nuevos:" + password_again.getText().toString());

                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                intent.putExtra("name", name.getText().toString());
                startActivity(intent);
            }
        });

    }
}
