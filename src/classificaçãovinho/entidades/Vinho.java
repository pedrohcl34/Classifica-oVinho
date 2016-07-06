/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificaçãovinho.entidades;

/**
 *
 * @author PedroLima
 */
public class Vinho {
private float acidezFixa; 
private float acidezVolatil; 
private float acidoCitrico; 
private float residuosDeAcucar; 
private float cloridos; 
private float dioxidoDeEnxofre; 
private float dioxidoDeEnxofreTotal;  
private float densidade; 
private float ph; 
private float sulfato; 
private float alcool;


private int qualidade ;

    public Vinho(float acidezFixa, float acidezVolatil, float acidoCitrico, float residuosDeAcucar, float cloridos, float dioxidoDeEnxofre, float dioxidoDeEnxofreTotal, float densidade, float ph, float sulfato, float alcool, int qualidade) {
        this.acidezFixa = acidezFixa;
        this.acidezVolatil = acidezVolatil;
        this.acidoCitrico = acidoCitrico;
        this.residuosDeAcucar = residuosDeAcucar;
        this.cloridos = cloridos;
        this.dioxidoDeEnxofre = dioxidoDeEnxofre;
        this.dioxidoDeEnxofreTotal = dioxidoDeEnxofreTotal;
        this.densidade = densidade;
        this.ph = ph;
        this.sulfato = sulfato;
        this.alcool = alcool;
        this.qualidade = qualidade;
    }

    public float getAcidezFixa() {
        return acidezFixa;
    }

    public void setAcidezFixa(float acidezFixa) {
        this.acidezFixa = acidezFixa;
    }

    public float getAcidezVolatil() {
        return acidezVolatil;
    }

    public void setAcidezVolatil(float acidezVolatil) {
        this.acidezVolatil = acidezVolatil;
    }

    public float getAcidoCitrico() {
        return acidoCitrico;
    }

    public void setAcidoCitrico(float acidoCitrico) {
        this.acidoCitrico = acidoCitrico;
    }

    public float getResiduosDeAcucar() {
        return residuosDeAcucar;
    }

    public void setResiduosDeAcucar(float residuosDeAcucar) {
        this.residuosDeAcucar = residuosDeAcucar;
    }

    public float getCloridos() {
        return cloridos;
    }

    public void setCloridos(float cloridos) {
        this.cloridos = cloridos;
    }

    public float getDioxidoDeEnxofre() {
        return dioxidoDeEnxofre;
    }

    public void setDioxidoDeEnxofre(float dioxidoDeEnxofre) {
        this.dioxidoDeEnxofre = dioxidoDeEnxofre;
    }

    public float getDioxidoDeEnxofreTotal() {
        return dioxidoDeEnxofreTotal;
    }

    public void setDioxidoDeEnxofreTotal(float dioxidoDeEnxofreTotal) {
        this.dioxidoDeEnxofreTotal = dioxidoDeEnxofreTotal;
    }

    public float getDensidade() {
        return densidade;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }

    public float getPh() {
        return ph;
    }

    public void setPh(float ph) {
        this.ph = ph;
    }

    public float getSulfato() {
        return sulfato;
    }

    public void setSulfato(float sulfato) {
        this.sulfato = sulfato;
    }

    public float getAlcool() {
        return alcool;
    }

    public void setAlcool(float alcool) {
        this.alcool = alcool;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }
    


}
