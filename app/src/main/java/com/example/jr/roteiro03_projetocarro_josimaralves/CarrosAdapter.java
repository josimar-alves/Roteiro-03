package com.example.jr.roteiro03_projetocarro_josimaralves;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class CarrosAdapter extends RecyclerView.Adapter<CarrosAdapter.CarrosViewHolder> {

    private Context context;
    private List<Carros> carros;
    private CarrosApplication application;

    public CarrosAdapter(Context context) {
        this.context = context;
        application = (CarrosApplication)context.getApplicationContext();
        carros = application.getCarros();
    }
    @Override
    public CarrosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_list_main, viewGroup, false);
        return new CarrosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrosViewHolder holder, int position) {

        Carros c = carros.get(position);
        holder.imgView.setImageDrawable(context.getResources().getDrawable(c.getIdImagemCarro()));
        holder.textView.setText(c.getNomeCarro());
    }

    @Override
    public int getItemCount() {
        return this.carros.size();
    }

    public class CarrosViewHolder extends RecyclerView.ViewHolder {

        private View toqueView;
        private ImageView imgView;
        private TextView textView;

        public CarrosViewHolder (View itemView) {
            super(itemView);
            toqueView = itemView.findViewById(R.id.toque_list);
            imgView = (ImageView)itemView.findViewById(R.id.img_list_main);
            textView = (TextView)itemView.findViewById(R.id.text_list_main);

            toqueView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getPosition();
                    application.removerCarro(position);
                    Toast.makeText(context, "Removeu da posição " +position, Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });

        }
    }
}