package com.example.addkaro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView2, textView, textView3 ;
    EditText n1, n2 ;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Successfully Submitted", Toast.LENGTH_SHORT).show();
        textView2 = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView );
        textView3 = findViewById(R.id.textView3);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                textView3.setText("The sum of numbers is " +sum );
            }
        });



    }
}