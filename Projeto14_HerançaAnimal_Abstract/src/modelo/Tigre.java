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
public class Tigre {
    private String cor;
    
    public void maknoise(){
        System.out.println("urra");
    }
    public void movimentar(){
        System.out.println("corre");
    }

    public Tigre() {
    }

    public Tigre(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
