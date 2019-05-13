package br.ufc.quixada.dadm.manualdobixo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.ufc.quixada.dadm.manualdobixo.R;
import br.ufc.quixada.dadm.manualdobixo.constants.ResultCode;
import br.ufc.quixada.dadm.manualdobixo.dao.OfertaDAO;
import br.ufc.quixada.dadm.manualdobixo.model.Oferta;

public class MoradiaAddActivity extends AppCompatActivity {

    private EditText moradiaAddTitulo;
    private EditText moradiaAddEndereco;
    private EditText moradiaAddTipo;
    private EditText moradiaAddDescricao;
    private EditText moradiaAddPreco;
    private EditText moradiaAddQtdQuartos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moradia_add);

        setup();
        initComponents();
    }

    private void setup() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponents() {
        moradiaAddTitulo = findViewById(R.id.moradia_add_titulo);
        moradiaAddEndereco = findViewById(R.id.moradia_add_endereco);
        moradiaAddTipo = findViewById(R.id.moradia_add_tipo);
        moradiaAddDescricao = findViewById(R.id.moradia_add_descricao);
        moradiaAddPreco = findViewById(R.id.moradia_add_preco);
        moradiaAddQtdQuartos = findViewById(R.id.moradia_add_qtd_quartos);
    }

    public void btnAddMoradiaClick(View view) {
        String titulo = moradiaAddTitulo.getText().toString();
        String endereco = moradiaAddEndereco.getText().toString();
        String tipo = moradiaAddTipo.getText().toString();
        String descricao = moradiaAddDescricao.getText().toString();
        Float preco = Float.parseFloat(moradiaAddPreco.getText().toString());
        Integer qtdQuartos = Integer.parseInt(moradiaAddQtdQuartos.getText().toString());
        Oferta oferta = new Oferta(titulo, endereco, tipo, descricao, preco, qtdQuartos);
        OfertaDAO.getInstance().add(oferta);
        setResult(ResultCode.SUCCESS);
        finish();
    }
}
