package br.ufc.quixada.dadm.manualdobixo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.ufc.quixada.dadm.manualdobixo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imgBtnInstituicaoClick(View view) {
        Intent intent = new Intent(getApplicationContext(), TopicosMenuActivity.class);
        startActivity(intent);
    }

    public void imgBtnCampusClick(View view) {
        Toast.makeText(getApplicationContext(), "Go to the Campus Activity", Toast.LENGTH_SHORT).show();
    }

    public void imgBtnCursosClick(View view) {
        Toast.makeText(getApplicationContext(), "Go to the Courses Activity", Toast.LENGTH_SHORT).show();
    }


    public void imgBtnMoradiaClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MoradiaMenuActivity.class);
        startActivity(intent);

    }

    public void imgBtnRecomendacoesClick(View view) {
        Toast.makeText(getApplicationContext(), "Go to the Recommendations Activity", Toast.LENGTH_SHORT).show();
    }

}
