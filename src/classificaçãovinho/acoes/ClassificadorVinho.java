/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificaçãovinho.acoes;

import classificaçãovinho.basedados.CarregarBase;
import classificaçãovinho.entidades.Vinho;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.collections.FXCollections;

/**
 *
 * @author PedroLima
 */
public class ClassificadorVinho {

    private ArrayList<Vinho> vinhos;

    public ClassificadorVinho(String base) throws FileNotFoundException{
        vinhos = CarregarBase.lerBase(base);
    }

    private int numVinhosQualidade(int qualidade) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getQualidade() == qualidade) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaAcidezFixa(int qualidade, float acidezFixa) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getAcidezFixa() <= acidezFixa && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaAcidezVolatil(int qualidade, float acidezVoltatil) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getAcidezVolatil() <= acidezVoltatil && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaAcidoCitrico(int qualidade, float acidezCitrico) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getAcidoCitrico() <= acidezCitrico && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaResiduosDeAcucar(int qualidade, float residuosDeAcucar) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getResiduosDeAcucar() <= residuosDeAcucar && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaCloridos(int qualidade, float cloridos) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getCloridos() <= cloridos && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaDioxidoDeEnxofre(int qualidade, float dioxidoDeEnxofre) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getDioxidoDeEnxofre() <= dioxidoDeEnxofre && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaDioxidoDeEnxofreTotal(int qualidade, float dioxidoDeEnxofreTotal) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getDioxidoDeEnxofreTotal() <= dioxidoDeEnxofreTotal && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaDensidade(int qualidade, float densidade) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getDensidade() <= densidade && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaPh(int qualidade, float ph) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getPh() <= ph && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }

    private int numVinhosQualidadeTuplaSulfato(int qualidade, float sulfato) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getSulfato() <= sulfato && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }
    
      private int numVinhosQualidadeTuplaAlcool(int qualidade, float alcool) {
        int contador = 0;
        for (int i = 0; i < vinhos.size(); i++) {
            if (vinhos.get(i).getAlcool() <= alcool && qualidade == vinhos.get(i).getQualidade()) {
                contador++;
            }
        }
        return contador;
    }
      
    public int naiveBayes(Vinho vinho){
        int quantQualidade[] = new int[11];
        
        for(int i=0;i<11;i++)
            quantQualidade[i] = numVinhosQualidade(i);
        float qualidadeTupla[] = new float[11];
        for(int i=0;i<11;i++)
            qualidadeTupla[i] = 1;
        for(int i=0;i<11;i++){
           float acidezFixa     =   numVinhosQualidadeTuplaAcidezFixa(i, vinho.getAcidezFixa())/(float)quantQualidade[i];
           if(quantQualidade[i]==0)
               acidezFixa = 0;
           
           float acidezVolatil  =   numVinhosQualidadeTuplaAcidezVolatil(i, vinho.getAcidezFixa())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               acidezVolatil =0;
           
           float acidoCitrico   =   numVinhosQualidadeTuplaAcidoCitrico(i, vinho.getAcidoCitrico())/(float)quantQualidade[i];;
           if(quantQualidade[i]==0)
               acidoCitrico = 0;
           
           float residuosDeAcucar   =   numVinhosQualidadeTuplaResiduosDeAcucar(i, vinho.getResiduosDeAcucar())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               residuosDeAcucar = 0;
           
           float cloridos       =   numVinhosQualidadeTuplaCloridos(i, vinho.getCloridos())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               cloridos = 0;
           
           float dioxidoDeEnxofre   =   numVinhosQualidadeTuplaDioxidoDeEnxofre(i, vinho.getDioxidoDeEnxofre())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               dioxidoDeEnxofre = 0;
           
           float dioxidoDeEnxofreTotal  = numVinhosQualidadeTuplaDioxidoDeEnxofreTotal(i,vinho.getDioxidoDeEnxofreTotal())/(float)quantQualidade[i];;  
           if(quantQualidade[i]==0)
               dioxidoDeEnxofreTotal = 0;
           
           float densidade  =   numVinhosQualidadeTuplaDensidade(i, vinho.getDensidade())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               densidade = 0;
           
           float ph = numVinhosQualidadeTuplaPh(i, vinho.getPh())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               ph = 0;
           
           float sulfato    =   numVinhosQualidadeTuplaSulfato(i,vinho.getSulfato())/(float)quantQualidade[i];; 
           if(quantQualidade[i]==0)
               sulfato = 0;
           
           float alcool     =   numVinhosQualidadeTuplaAlcool(i,vinho.getAlcool())/(float)quantQualidade[i];;
           if(quantQualidade[i]==0)
               alcool = 0;
           
           qualidadeTupla[i] = acidezFixa *acidezVolatil*acidoCitrico*residuosDeAcucar*cloridos*dioxidoDeEnxofre*dioxidoDeEnxofreTotal*densidade*ph*sulfato*alcool;
        }
        
        for(int i=0;i<11;i++){
            qualidadeTupla[i] *= (float)quantQualidade[i]/(float)vinhos.size();
        }
        int qualidadeMaior = 0;
        
        for(int i=1;i<11;i++){
            if(qualidadeTupla[qualidadeMaior]<qualidadeTupla[i] || qualidadeTupla[qualidadeMaior]==Float.NaN)
                qualidadeMaior =i;
        }
        
        return qualidadeMaior;
    }
    public static void main(String args[]){
        try{
        ClassificadorVinho classifica = new ClassificadorVinho("winequality-white.csv");
        int resultado = classifica.naiveBayes(new Vinho(9.6f,0.35f,1f,1.3333f,0.2f,23f,71f,0.24342f,7.52f,0.35f,8.7f,5));
            System.out.println("Classificação "+resultado);
        }catch(FileNotFoundException ex){
            System.out.println("Erro "+ex.getMessage());
        }
        
    }
    
}
