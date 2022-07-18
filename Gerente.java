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
public class Gerente extends Empregado{
    String departamento;

    public Gerente(){
        
    }
    
    public Gerente(String departamento, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.departamento = departamento;
    }

    
    
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString(){
        return "Nome: "+this.nome+" Idade: "+this.idade +" Sexo: "+this.sexo+" Salario: "+this.salario+ " Matricula"+this.matricula+" Departamento: "+this.departamento;
    }
}
