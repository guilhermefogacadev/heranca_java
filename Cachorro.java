/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadejava;


/**
 *
 * @author guilh
 */
public class Cachorro extends Animal {
    String raça;
    String corDoPelo;


    public Cachorro(String raça, String corDoPelo, String nome, double peso) {
        super(nome, peso);
        this.raça = raça;
        this.corDoPelo = corDoPelo;
    }
    public Cachorro (){
        
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
    
    public void latir(){
        System.out.println("Latiu");
    }
    public void abanar(){
        System.out.println("Abanou o rabo");
    }
}
