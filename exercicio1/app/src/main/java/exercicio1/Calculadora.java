/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    public double soma(double n1, double n2) {
        return n1 + n2;
    }
    
    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }      
    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }
    
    public double divisao(double n1, double n2) {
       if(n2 == 0) {
        throw new ArithmeticException("Nao pode ser dividido por zero");
       } else {
        return n1 / n2;
       }
    }
    
    
    
}
