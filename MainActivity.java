package com.example.s23q1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=Integer.parseInt(e1.getText().toString());
                long f=1;
                for(int i=n;i>0;i--)
                {
                    f=f*i;
                }
                String res= String.valueOf(f);

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Factorial of Number is-"+res);
                AlertDialog ad= builder.create();
                ad.show();

            }
        });
    }
}