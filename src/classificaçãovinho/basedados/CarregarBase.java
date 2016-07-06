/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificaçãovinho.basedados;

import classificaçãovinho.entidades.Vinho;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PedroLima
 */
public class CarregarBase {
    public static ArrayList<Vinho> lerBase(String fileName) throws FileNotFoundException {
        ArrayList<Vinho> vinhos = new ArrayList<Vinho>();
            Scanner in = new Scanner(new File(fileName));
            //leitura da base de dados
            while(in.hasNext()){
                Vinho vinho = new Vinho(0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                //topo do tabuleiro sendo preenchido
                String linha[] = in.next().split(";");
                vinho.setAcidezFixa(Float.parseFloat(linha[0]));
                vinho.setAcidezVolatil(Float.parseFloat(linha[1]));
                vinho.setAcidoCitrico(Float.parseFloat(linha[2]));
                vinho.setResiduosDeAcucar(Float.parseFloat(linha[3]));
                vinho.setCloridos(Float.parseFloat(linha[4]));
                vinho.setDioxidoDeEnxofre(Float.parseFloat(linha[5]));
                vinho.setDioxidoDeEnxofreTotal(Float.parseFloat(linha[6]));
                vinho.setDensidade(Float.parseFloat(linha[7]));
                vinho.setPh(Float.parseFloat(linha[8]));
                vinho.setSulfato(Float.parseFloat(linha[9]));
                vinho.setAlcool(Float.parseFloat(linha[10]));
                
                vinho.setQualidade(Integer.parseInt(linha[11]));
                vinhos.add(vinho);
            }
        
        return vinhos;
    }
    
    
}
