package br.com.ranking;

import java.util.Calendar;
import java.util.List;


public class Partida {

    private Calendar inicio;
    private Calendar fim;
    private List<Ocorrencia> listOcorrencias;
    
    public Calendar getInicio() {
        return inicio;
    }
    
    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }
    
    public Calendar getFim() {
        return fim;
    }
    
    public void setFim(Calendar fim) {
        this.fim = fim;
    }
    
    public List<Ocorrencia> getListOcorrencias() {
        return listOcorrencias;
    }
    
    public void setListOcorrencias(List<Ocorrencia> listOcorrencias) {
        this.listOcorrencias = listOcorrencias;
    }

    
}
