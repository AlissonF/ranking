package br.com.ranking;

import java.util.Calendar;


public class Ocorrencia {
    
    private Calendar data;
    private Jogador jogador1;
    private Jogador jogador2;
    private Arma arma;
    
    public Calendar getData() {
        return data;
    }
    
    public void setData(Calendar data) {
        this.data = data;
    }
    
    public Jogador getJogador1() {
        return jogador1;
    }
    
    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }
    
    public Jogador getJogador2() {
        return jogador2;
    }
    
    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }
    
    public Arma getArma() {
        return arma;
    }
    
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    
}
