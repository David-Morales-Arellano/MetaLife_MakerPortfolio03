package com.example.metalife_beta.funcionalities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.R;

public class DivisasActivity extends AppCompatActivity {

    private static final String TAG = "Message";

    //Declaring Widgets
    TextView Title1, Title2, Title3, Text1;
    EditText Input1;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.divisas_layout);

        Log.i(TAG, "onCreate Method is called.");

        //Instantiating Widgets
        Title1 = findViewById(R.id.Title1);
        Title2 = findViewById(R.id.Title2);
        Title3 = findViewById(R.id.Title3);
        Text1 = findViewById(R.id.Text1);

        Input1 = findViewById(R.id.Input1);

        button = findViewById(R.id.button1);

        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Converter();
            }
        });
    }
    private void Converter() {

        String valueInput = Input1.getText().toString();

        double valueInputNumber = Double.parseDouble(valueInput);
        double valueFinal = valueInputNumber * 1.07;

        Text1.setText(valueFinal + "$");
    }
}