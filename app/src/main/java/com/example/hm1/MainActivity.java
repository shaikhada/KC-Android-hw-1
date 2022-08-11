package com.example.hm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView a = findViewById(R.id.textView);
        EditText b = findViewById(R.id.ed1);
        EditText c = findViewById(R.id.ed2);
        EditText d = findViewById(R.id.ed3);
        EditText f = findViewById(R.id.ed4);
        Button g = findViewById(R.id.button);
        TextView h = findViewById(R.id.textView2);
        Button i = findViewById(R.id.button2);





        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(b.getText().toString());
                int second = Integer.parseInt(c.getText().toString());
                int third = Integer.parseInt(d.getText().toString());
                int fourth = Integer.parseInt(f.getText().toString());

                int Result = first + second + third + fourth;

                h.setText(String.valueOf(Result));

            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.setText("");
                c.setText("");
                d.setText("");
                f.setText("");
                h.setText("");

            }
        });
    }
}