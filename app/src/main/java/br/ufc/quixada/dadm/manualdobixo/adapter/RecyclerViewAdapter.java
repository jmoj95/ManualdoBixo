package br.ufc.quixada.dadm.manualdobixo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import br.ufc.quixada.dadm.manualdobixo.R;
import br.ufc.quixada.dadm.manualdobixo.activity.MoradiaItemActivity;
import br.ufc.quixada.dadm.manualdobixo.dao.OfertaDAO;
import br.ufc.quixada.dadm.manualdobixo.model.Oferta;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private Context context;

    public RecyclerViewAdapter (Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_oferta_menu_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called.");
        final Oferta oferta = OfertaDAO.getInstance().get(i);
        viewHolder.txtOfertaTitulo.setText(oferta.getTitulo());
        viewHolder.txtOfertaTipo.setText(oferta.getTipo());
        viewHolder.txtOfertaEndereco.setText(oferta.getEndereco());
        viewHolder.txtOfertaQuartos.setText(oferta.getQtdQuartos() + " Quartos");
        viewHolder.txtOfertaPreco.setText("R$" + oferta.getPreco());

        viewHolder.constraintLayoutOfertaMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This should call the " + oferta.getTitulo() + " offer", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), MoradiaItemActivity.class);
                intent.putExtra("oferta_id", i);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return OfertaDAO.getInstance().getOfertaCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtOfertaTitulo;
        TextView txtOfertaTipo;
        TextView txtOfertaEndereco;
        TextView txtOfertaQuartos;
        TextView txtOfertaPreco;
        ConstraintLayout constraintLayoutOfertaMenuItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtOfertaTitulo = itemView.findViewById(R.id.txt_oferta_titulo);
            txtOfertaTipo = itemView.findViewById(R.id.txt_oferta_tipo);
            txtOfertaEndereco = itemView.findViewById(R.id.txt_oferta_endereco);
            txtOfertaQuartos = itemView.findViewById(R.id.txt_oferta_quartos);
            txtOfertaPreco = itemView.findViewById(R.id.txt_oferta_preco);
            constraintLayoutOfertaMenuItem = itemView.findViewById(R.id.constraint_layout_oferta_menu_item);
        }
    }

}
