/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author guilh
 */
public class Cliente extends Pessoa{
    double valorDivida;
    int anoNascimento;

    public Cliente(){
        
    }
    

    public Cliente(double valorDivida, int anoNascimento, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String toString(){
        return "Nome: "+this.nome+" Ano nascimento: "+ this.anoNascimento+" Idade: "+this.idade +" Sexo: "+this.sexo+" Valor divida: "+ this.valorDivida;
    }
    
}
