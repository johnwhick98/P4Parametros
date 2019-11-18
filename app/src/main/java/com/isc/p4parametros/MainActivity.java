package com.isc.p4parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vnombre=(EditText) findViewById(R.id.nombre);
    }

    public void EnviarParametros(View v){
        Intent pantalla= new Intent(this, ReibeParametrosActivity.classe);

        pantalla.putExtra("pnombre", vnombre.getText().toString());
        startActivity(pantalla);
        finish();
    }
}
