package com.example.gvpworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private TextView t;
    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        t = findViewById(R.id.tv_text);
        txt = findViewById(R.id.et_name);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txt.getText().toString();
                if (name.length() > 0) {
                    t.setText("HELLO "+ name + " WELCOME TO GVP");

                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "hey,the name is empty", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}