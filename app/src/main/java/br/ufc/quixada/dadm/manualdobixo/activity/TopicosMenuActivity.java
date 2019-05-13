package br.ufc.quixada.dadm.manualdobixo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.ufc.quixada.dadm.manualdobixo.R;

public class TopicosMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicos_menu);

        setup();
    }

    private void setup() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void btnDiretoriaClick(View v) {

    }

    public void btnEstruturaClick(View v) {

    }
}
