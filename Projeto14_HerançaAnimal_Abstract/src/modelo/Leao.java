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
public class Leao {
    private String origem;

    public Leao() {
    }

    public Leao(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    public void makenoise(){
        System.out.println("rugido");
    }
    
    public void caminhar(){
        System.out.println("corre");
    }
    
    
}
