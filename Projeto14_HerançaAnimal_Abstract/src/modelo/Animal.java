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
public abstract class Animal {
    protected String habitat;
    protected String comida;
    
   //metodo makeinNoise() passou a ser um metdo 
    //abstrato e  portanto nao tenho mais implemtanção 
    //corpo do metodo
    // todo metodo abstrato obrigatoriamente deve ser
    //implementado nas classe filho(oncretas).
    //para definir um metodo Abstrato devo colocar
    //a palavra reservada 'abstract' na assinatura do 
    //metodo e colocar um ponte e virgula e, vez de abre e fecha chaves
    //do corpo do metodo.
    public abstract void makenoise();
       
        
    
    public abstract void movimentar();
       
    

    
}  
    

