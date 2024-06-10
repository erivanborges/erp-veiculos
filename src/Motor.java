/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Motor {
    
    private int qtdPistao;
    private int potencia;
    
    public Motor(){
        this.qtdPistao = 0;
        this.potencia = 0;
    }
    
    public Motor(int qtdPistao, int potencia){
        this.qtdPistao = qtdPistao;
        this.potencia = potencia;
    }

    /**
     * @return the qtdPistao
     */
    public int getQtdPistao() {
        return qtdPistao;
    }

    /**
     * @param qtdPistao the qtdPistao to set
     */
    public void setQtdPistao(int qtdPistao) {
        this.qtdPistao = qtdPistao;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    
}
