package com.example.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button addBtn;
    private TextView txtVHobbies;
    private EditText hobbiesTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.addBtn);
        txtVHobbies = findViewById(R.id.txtVHobbies);
        hobbiesTxt = findViewById(R.id.hobbiesTxt);
        textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    txtVHobbies.setVisibility(View.VISIBLE);
                    txtVHobbies.setText(hobbiesTxt.getText());
                    hobbiesTxt.setText("");

            }
        });
    }
}