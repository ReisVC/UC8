/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuProjetoJava;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    String nome;
    int idade;
    
    // O construtor, em Java, � um METODO que N�O TEM RETORNO e TEM O MESMO NOME DA CLASSE
    public Pessoa(String meuNome, int minhaIdade) {
        idade = minhaIdade;
        this.nome = meuNome;
    }
    
    public void caminhar() {
        System.out.println(nome + " est� caminhando.");
    }
}
