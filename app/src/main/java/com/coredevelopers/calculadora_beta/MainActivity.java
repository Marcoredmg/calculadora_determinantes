package com.coredevelopers.calculadora_beta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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

        final EditText x1 = (EditText) findViewById(R.id.a1);
        final EditText x2 = (EditText) findViewById(R.id.a2);
        final EditText x3 = (EditText) findViewById(R.id.a3);

        final EditText y1 = (EditText) findViewById(R.id.b1);
        final EditText y2 = (EditText) findViewById(R.id.b2);
        final EditText y3 = (EditText) findViewById(R.id.b3);

        final EditText z1 = (EditText) findViewById(R.id.c1);
        final EditText z2 = (EditText) findViewById(R.id.c2);
        final EditText z3 = (EditText) findViewById(R.id.c3);

        final Button b_calculo = (Button) findViewById(R.id.b_calculo);
        final TextView resultado = (TextView) findViewById(R.id.resultado_val);

        x1.setText("0");
        x2.setText("0");
        x3.setText("0");

        y1.setText("0");
        y2.setText("0");
        y3.setText("0");

        z1.setText("0");
        z2.setText("0");
        z3.setText("0");

        b_calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(x1.getText().toString());
                int b = Integer.parseInt(x2.getText().toString());
                int c = Integer.parseInt(x3.getText().toString());
                int d = Integer.parseInt(y1.getText().toString());
                int e = Integer.parseInt(y2.getText().toString());
                int f = Integer.parseInt(y3.getText().toString());
                int g = Integer.parseInt(z1.getText().toString());
                int h = Integer.parseInt(z2.getText().toString());
                int i = Integer.parseInt(z3.getText().toString());
                int determinante = CalculoDeterminante(a, b, c, d, e, f, g, h, i);
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
