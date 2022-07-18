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
public class Animal {
    String nome;
    double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Animal() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String toString(){
        return"Nome: "+this.nome+" Peso: "+ this.peso;
    }
}
