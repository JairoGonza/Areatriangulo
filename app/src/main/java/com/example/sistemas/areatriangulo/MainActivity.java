package com.example.sistemas.areatriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_base;
    private EditText et_altura;
    private TextView tv_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_base=(EditText)findViewById(R.id.et_base);
        et_altura=(EditText)findViewById(R.id.et_altura);
        tv_resultado=(TextView)findViewById(R.id.tv_Resultado);
    }
    public void calcular(View view)
    {
        String valor1=et_base.getText().toString();
        String valor2=et_altura.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int area=n1*n2/2;
        String res=String.valueOf(area);
        tv_resultado.setText(res);

    }
}
