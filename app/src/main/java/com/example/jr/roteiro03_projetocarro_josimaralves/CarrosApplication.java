package com.example.jr.roteiro03_projetocarro_josimaralves;

/**
 * Created by Jr on 20/03/2016.
 */

import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Jr on 20/03/2016.
 */
public class CarrosApplication extends Application {

    private List<Carros> carros;

    @Override
    public void onCreate() {
        super.onCreate();
        this.carros = new ArrayList<>();
        criarCarrosPadrao();
    }

    private void criarCarrosPadrao() {
        this.carros.add(new Carros(R.drawable.bmw_720, "BMW 720"));
        this.carros.add(new Carros(R.drawable.camaro, "Camaro"));
        this.carros.add(new Carros(R.drawable.corvette, "Corvette"));
        this.carros.add(new Carros(R.drawable.gallardo, "Gallardo"));
        this.carros.add(new Carros(R.drawable.mustang, "Mustang"));

    }

    public List<Carros> getCarros() {
        return this.carros;
    }

    public void adicionarCarro() {
        Random random = new Random();
        int posicao = random.nextInt(this.carros.size());
        Carros carro = this.carros.get(posicao);
        this.carros.add(carro);
    }

    public void removerCarro(int posicao) {
        this.carros.remove(posicao);
    }


}
