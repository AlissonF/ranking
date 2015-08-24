package br.com.ranking;

import java.util.List;

public class Jogo {
    
    
    public static void main(String[] args) {
        
        ProcessaLog procesaLog = new ProcessaLog();
        List<String> logs = procesaLog.getLogs();
        
        Partida partida = new Partida();
        
        for (String log : logs) {
            
            String parts[] = log.split("[ ]");
            
            if(parts[7].contentEquals("started")){
                //partida.setInicio();
            }else if(log.contains("ended")){
                //partida.setFim();
            }else{
                
                
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setData();
            
            Jogador j1 = new Jogador();
            ocorrencia.setJogador1();
            ocorrencia.setJogador2();
            ocorrencia.setArma();
            
            partida.getListOcorrencias().add(ocorrencia);
            }
        }
        
        
       
    }
    
    private void montaJogador(){
        
    }
    
}
