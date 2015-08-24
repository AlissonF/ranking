package br.com.ranking;

import java.util.Calendar;
import java.util.List;


public class Jogador {
    
    private String nome;
    private String streak;
    private List<Arma> arma;
    private List<Calendar> assasinatos;
    private List<Calendar> mortes;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getStreak() {
        return streak;
    }
    
    public void setStreak(String streak) {
        this.streak = streak;
    }
    
    public List<Calendar> getAssasinatos() {
        return assasinatos;
    }
    
    public void setAssasinatos(List<Calendar> assasinatos) {
        this.assasinatos = assasinatos;
    }
    
    public List<Calendar> getMortes() {
        return mortes;
    }
    
    public void setMortes(List<Calendar> mortes) {
        this.mortes = mortes;
    }
    
    public List<Arma> getArma() {
        return arma;
    }
    
    public void setArma(List<Arma> arma) {
        this.arma = arma;
    }
}
