package com.example.carlo.juegoconinterfacesdeusuario;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PuntosActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntos);
        Bundle bundle = getIntent().getExtras();
        String puntos = bundle.getString("puntos");
        TextView mostrador_puntos = (TextView) findViewById(R.id.mostrador_puntos);
        mostrador_puntos.setText("Has conseguido: "+puntos);

        Button btnRestart = (Button) findViewById(R.id.btnrestart);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
