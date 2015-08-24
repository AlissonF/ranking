package br.com.ranking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Jogo {
	
    
    
    public static void main(String[] args) {
        
        ProcessaLog procesaLog = new ProcessaLog();
        List<String> logs = procesaLog.getLogs();
        
        Partida partida = new Partida();
        
        for (String log : logs) {
            
            String dataParts[] = log.split("-");
            
            if(dataParts[1].contains("started")){
                partida.setInicio(processaData(dataParts[0]));
            }else if(dataParts[1].contains("ended")){
                partida.setFim(processaData(dataParts[0]));
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
    
    private static Calendar processaData(String data){
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
    	
    	Calendar calendar = Calendar.getInstance();
    	Date date = null;
			try {
				date = sdf.parse(data);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	calendar.setTime(date);
    	return calendar;
    }
    
    
    
}
