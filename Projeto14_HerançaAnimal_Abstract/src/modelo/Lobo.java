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
public class Lobo {
    private double peso;
    
    public void makenoise(){
        System.out.println("uiva");
    }
    public void movimentar(){
        System.out.println(" corre ");
    }

    public Lobo() {
    }

    public Lobo(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
