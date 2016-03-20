package com.example.jr.roteiro03_projetocarro_josimaralves;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jr on 20/03/2016.
 */
public class CarrosAdapter extends RecyclerView.Adapter<CarrosAdapter.CarrosViewHolder> {
    private Context context;
    private List<Carros> carros;
    private CarrosApplication application;

    public CarrosAdapter(Context context) {
        this.context = context;
        application = (CarrosApplication) context.getApplicationContext();
        carros = application.getCarros();
    }

    @Override
    public CarrosAdapter.CarrosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CarrosAdapter.CarrosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public CarrosViewHolder onCreateViewHolder(RecyclerView.ViewHolder viewGroup, int viewType) {// Inflo meu layout e armazeno ele em uma view
        View view = LayoutInflater.from(context).inflate(R.layout.content_list_main, viewGroup, false);
        // Envio meu layout inflado (view) para a classe ViewHolder
        return new CarrosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrosViewHolder holder, int position) {
        Carros c = carros.get(position); // Capturo meu carro da posição// Mostro a imagem do meu carro
        holder.imgView.setImageAlpha(c.getIdImagemCarro());// Exibo o nome do carro
        holder.textView.setText(c.getNomeCarro());
    }

    @Override
    public int getItemCount() {
        return this.carros.size(); // Retorno o tamanho da lista de carros}
    }

    public class CarrosViewHolder extends RecyclerView.ViewHolder {
        private View toqueView;
        private ImageView imgView;
        private TextView textView;

        public CarrosViewHolder(View itemView) {
            super(itemView);
            toqueView = itemView.findViewById(R.id.toque_list);
            imgView = (ImageView) itemView.findViewById(R.id.img_list_main);
            textView = (TextView) itemView.findViewById(R.id.text_list_main);
        }
    }
}
