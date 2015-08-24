package br.com.ranking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProcessaLog {
    
    public List<String> getLogs(){
        
        List<String> listOcorrencias = null;
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("C:\\java\\workspaces\\workspace_java\\ranking\\src\\main\\java\\br\\com\\ranking\\resources\\log.txt");
            listOcorrencias = new ArrayList<String>();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(fis);
        
        while(scanner.hasNextLine()){
            listOcorrencias.add(scanner.nextLine());
        }
        scanner.close();
        
        return listOcorrencias;
    }
    
}
