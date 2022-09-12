package com.example.appandoid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
    }

    public void sumar(View v){

        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int v1=Integer.parseInt(s1);
        int v2=Integer.parseInt(s2);
        int suma=v1+v2;
        tv1.setText("La suma es:"+ suma );

    }


    public void restar(View v){

        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int v1=Integer.parseInt(s1);
        int v2=Integer.parseInt(s2);
        int resta=v1-v2;
        tv1.setText("La resta es:"+ resta );

    }

    public void multiplicacion(View v){

        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int v1=Integer.parseInt(s1);
        int v2=Integer.parseInt(s2);
        int multiplicacion= v1 * v2;
        tv1.setText("La multiplicacion es:"+ multiplicacion );

    }

    public void division(View v){


        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        float v1=Integer.parseInt(s1);
        float v2=Integer.parseInt(s2);
        float division=v1/v2;
        tv1.setText("La division es:"+ division);

    }

}