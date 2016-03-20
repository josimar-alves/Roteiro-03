package com.example.jr.roteiro03_projetocarro_josimaralves;

/**
 * Created by Jr on 20/03/2016.
 */
public class Carros {
    private int idImagemCarro;
    private String nomeCarro;

    public Carros  (int idImagemCarro, String nomeCarro) {
        this.idImagemCarro = idImagemCarro;
        this.nomeCarro = nomeCarro;
    }

    public int getIdImagemCarro() {
        return idImagemCarro;
    }

    public void setIdImagemCarro(int idImagemCarro) {
        this.idImagemCarro = idImagemCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
}
