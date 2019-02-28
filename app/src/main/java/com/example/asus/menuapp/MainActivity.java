package com.example.asus.menuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editRupiah;
    RadioButton radioDollar, radioEuro;
    Button btnOkKonveksi;
    TextView textHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editRupiah = (EditText)findViewById(R.id.editRupiah);
        radioDollar = (RadioButton)findViewById(R.id.radioDollar);
        radioEuro = (RadioButton) findViewById(R.id.radioEuro);
        btnOkKonveksi = (Button)findViewById(R.id.btnOkKonveksi);
        textHasil = (TextView)findViewById(R.id.textHasil);

        btnOkKonveksi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String nilairupiah = editRupiah.getText().toString();

                if (radioDollar.isChecked()){
                    double hasil = Double.parseDouble(nilairupiah)/13000;
                    String result = Double.toString(hasil);
                    textHasil.setText(result);
                }
                if (radioEuro.isChecked()){
                    double hasil = Double.parseDouble(nilairupiah)/15000;
                    String result = Double.toString(hasil);
                    textHasil.setText(result);
                }

            }

        });
    }
}




