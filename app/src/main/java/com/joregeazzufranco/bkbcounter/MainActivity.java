package com.joregeazzufranco.bkbcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView puntosTA;
    private TextView puntosTB;
    private Button btnUnoA;
    private Button btnDosA;
    private Button btnTresA;
    private Button btnUnoB;
    private Button btnDosB;
    private Button btnTresB;
    public int pA = 0;
    public int pB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntosTA = (TextView) findViewById(R.id.puntosA);
        puntosTB = (TextView) findViewById(R.id.puntosB);

    }

    public void unPtoA(View v){
        pA++;
        puntosTA.setText("" + pA);
    }

    public void dosPtoA(View v){
        pA+=2;
        puntosTA.setText("" + pA);
    }

    public void tresPtoA(View v){
        pA+=3;
        puntosTA.setText("" + pA);
    }

    //Puntos de B

    public void unPtoB(View v){
        pB++;
        puntosTB.setText("" + pB);
    }

    public void dosPtoB(View v){
        pB+=2;
        puntosTB.setText("" + pB);
    }

    public void tresPtoB(View v){
        pB+=3;
        puntosTB.setText("" + pB);
    }

    public void reset(View v){
        pA=pB=0;
        puntosTA.setText("" + 0);
        puntosTB.setText("" + 0);
    }
}
