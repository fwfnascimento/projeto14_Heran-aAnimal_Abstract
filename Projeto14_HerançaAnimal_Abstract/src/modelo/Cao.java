/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Cao extends Canino {
    private double tamanho;
    
    
    public void makenoise(){
        System.out.println("late");
    }
    public void movimentar(){
        System.out.println("anda");
    }

    public Cao() {
    }

    public Cao(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
