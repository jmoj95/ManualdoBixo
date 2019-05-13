package br.ufc.quixada.dadm.manualdobixo.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import br.ufc.quixada.dadm.manualdobixo.R;
import br.ufc.quixada.dadm.manualdobixo.adapter.RecyclerViewAdapter;
import br.ufc.quixada.dadm.manualdobixo.constants.RequestCode;
import br.ufc.quixada.dadm.manualdobixo.constants.ResultCode;

public class MoradiaMenuActivity extends AppCompatActivity {

    private RecyclerView recyclerViewListaMoradias;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moradia_menu);

        setup();
        initComponents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_moradia_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_moradia_menu_item_add:
                Intent intent = new Intent(getApplicationContext(), MoradiaAddActivity.class);
                startActivityForResult(intent, RequestCode.ADD);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RequestCode.ADD && resultCode == ResultCode.SUCCESS) {
            recyclerViewAdapter.notifyDataSetChanged();
        }
    }

    private void setup() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponents() {
        recyclerViewListaMoradias = findViewById(R.id.recycler_view_lista_ofertas);
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext());
        recyclerViewListaMoradias.setAdapter(recyclerViewAdapter);
        recyclerViewListaMoradias.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}
