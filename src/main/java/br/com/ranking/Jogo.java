package br.com.ranking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Jogo {
	
    
    
    public static void main(String[] args) {
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        
        ProcessaLog procesaLog = new ProcessaLog();
        List<String> logs = procesaLog.getLogs();
        
        Partida partida = new Partida();
        
        for (String log : logs) {
            
            String dataParts[] = log.split("-");
            
            if(dataParts[1].contains("started")){
            	Calendar calendar = Calendar.getInstance();
            	Date date = null;
            	try {
					date = sdf.parse(dataParts[0]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
            	calendar.setTime(date);
                partida.setInicio(calendar);
            }else if(dataParts[1].contains("ended")){
            	Calendar calendar = Calendar.getInstance();
            	Date date = null;
            	try {
					date = sdf.parse(dataParts[0]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
            	calendar.setTime(date);
                partida.setInicio(calendar);
                partida.setFim(calendar);
            }else{
                
                
//            Ocorrencia ocorrencia = new Ocorrencia();
//            ocorrencia.setData();
//            
//            Jogador j1 = new Jogador();
//            ocorrencia.setJogador1();
//            ocorrencia.setJogador2();
//            ocorrencia.setArma();
//            
//            partida.getListOcorrencias().add(ocorrencia);
            	
            }
        }
        
        
       
    }
    
    private void montaJogador(){
        
    }
    
}
