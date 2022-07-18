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
public class Empregado extends Pessoa {
    double salario;
    String matricula;

    
    public Empregado(){
        
    }
    
    public Empregado(double salario, String matricula, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double calculaINSS(){
        double calc=this.salario+(this.salario*0.11);
        return calc;
    }
    @Override
    public String toString(){
        return "Nome: "+this.nome+" Idade: "+this.idade +" Sexo: "+this.sexo+ "Salario: "+this.salario+ "Matricula"+this.matricula;

    }
}
