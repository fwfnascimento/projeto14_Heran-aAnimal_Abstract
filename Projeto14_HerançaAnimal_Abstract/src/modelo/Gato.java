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
public class Gato {
    
    private String raca;

    public Gato() {
    }

    public Gato(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void makenoise(){
        System.out.println("mia");
    }
    
    public void movimentar(){
        System.out.println("caminha");
    }
    
}
