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
public class Vendedor extends Empregado{
    double valorComissao;

    public Vendedor(double valorComissao, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.valorComissao = valorComissao;
    }

    
    
    public double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }
    @Override
    public String toString(){
        return "Nome: "+this.nome+" Idade: "+this.idade +" Sexo: "+this.sexo+ " Matricula: "+this.matricula+" Valor Comissao: "+this.valorComissao+" Salario: "+this.salario;

    }
    
}
