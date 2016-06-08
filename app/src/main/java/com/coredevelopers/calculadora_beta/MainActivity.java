package com.coredevelopers.calculadora_beta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText a1 = (EditText) findViewById(R.id.a1);
        final EditText a2 = (EditText) findViewById(R.id.a2);
        final EditText a3 = (EditText) findViewById(R.id.a3);

        final EditText b1 = (EditText) findViewById(R.id.b1);
        final EditText b2 = (EditText) findViewById(R.id.b2);
        final EditText b3 = (EditText) findViewById(R.id.b3);

        final EditText c1 = (EditText) findViewById(R.id.c1);
        final EditText c2 = (EditText) findViewById(R.id.c2);
        final EditText c3 = (EditText) findViewById(R.id.c3);

        final Button b_calculo = (Button) findViewById(R.id.b_calculo);
        final TextView resultado = (TextView) findViewById(R.id.resultado_val);

        b_calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(a1.getText().toString());
                final int b = Integer.parseInt(a2.getText().toString());
                final int c = Integer.parseInt(a3.getText().toString());
                final int d = Integer.parseInt(b1.getText().toString());
                final int e = Integer.parseInt(b2.getText().toString());
                final int f = Integer.parseInt(b3.getText().toString());
                final int g = Integer.parseInt(c1.getText().toString());
                final int h = Integer.parseInt(c2.getText().toString());
                final int i = Integer.parseInt(c3.getText().toString());
                int determinante = CalculoDeterminante(a,b,c,d,e,f,g,h,i);
                resultado.setText("Determinante = " + determinante);
            }
        });
    }
    public static int CalculoDeterminante(int a1,int a2,int a3,int b1,int b2,int b3,int c1,int c2,int c3){
        int determinante;
        determinante = ((a1*b2*c3) + (a2*b3*c1) + (a3*b1*c2)) - ((a3*b2*c1) + (a2*b1*c3) + (a1*b3*c2));
        return determinante;
    }
}
