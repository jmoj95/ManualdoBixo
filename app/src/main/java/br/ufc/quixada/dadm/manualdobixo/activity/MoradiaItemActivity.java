package br.ufc.quixada.dadm.manualdobixo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import br.ufc.quixada.dadm.manualdobixo.R;
import br.ufc.quixada.dadm.manualdobixo.dao.OfertaDAO;
import br.ufc.quixada.dadm.manualdobixo.model.Oferta;

public class MoradiaItemActivity extends AppCompatActivity {

    private static final String TAG = "MoradiaItemActivity";

    private Oferta oferta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moradia_item);

        setup();
        initValues();
        initComponents();
    }

    private void setup() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initValues() {
        Integer id = (Integer) getIntent().getExtras().get("oferta_id");
        Log.d(TAG, "initValues: Calling oferta with id = " + id);
        this.oferta = OfertaDAO.getInstance().get(id);
    }

    private void initComponents() {
        TextView txtOfertaTitulo = findViewById(R.id.txt_oferta_item_titulo);
        TextView txtOfertaTipo = findViewById(R.id.txt_oferta_item_tipo);
        TextView txtOfertaEndereco = findViewById(R.id.txt_oferta_item_endereco);
        TextView txtOfertaQuartos = findViewById(R.id.txt_oferta_item_quartos);
        TextView txtOfertaPreco = findViewById(R.id.txt_oferta_item_preco);
        TextView txtOfertaDescricao = findViewById(R.id.txt_oferta_item_descricao);

        txtOfertaTitulo.setText(oferta.getTitulo());
        txtOfertaTipo.setText(oferta.getTipo());
        txtOfertaEndereco.setText(oferta.getEndereco());
        txtOfertaQuartos.setText(oferta.getQtdQuartos() + " Quartos");
        txtOfertaPreco.setText("R$" + oferta.getPreco());
        txtOfertaDescricao.setText(oferta.getDescricao());
    }
}
