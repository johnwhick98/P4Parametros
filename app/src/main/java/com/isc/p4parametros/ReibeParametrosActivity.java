package com.isc.p4parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReibeParametrosActivity extends AppCompatActivity {

    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reibe_parametros);

        Bundle parametros=getIntent().getExtras();
        vnombre=(TextView) findViewById(R.id.lblparametro);

        vnombre.setText("BIENVENIDO "+ parametros.getString("pnombre"));
    }
}
