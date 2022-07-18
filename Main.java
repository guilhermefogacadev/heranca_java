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
public class Main {
    public static void main(String[] args) {
        Pessoa p= new Pessoa("ds", 0, "M");
        Gerente g = new Gerente("dsds", 0, "erer", "dffd", 0, "M");
        Cliente c= new Cliente(0, 0, "eder", 0, "M");
        Empregado e= new Empregado(0, "dsd", "dfd", 0, " M");
        Vendedor v= new Vendedor(0, 0, "dd", "d", 0, "fddf");
        System.out.println(p);
        System.out.println(g);
        System.out.println(c);
        System.out.println(e);
        System.out.println(v);
    }
}
