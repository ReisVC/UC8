/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Game {
    
    private int numberToGuess;
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;
    boolean hasWon = false;
    int count = 1;
    
    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Bem vindo ao  Guessing Game, " + player.getName() + "!");
        
        while(!hasWon && this.count < 6){
            this.count++;
            System.out.println("Digite seu palpite:");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }
        
        if(count < 6) {
            System.out.println("Você perdeu");
        } else {
        System.out.println("Parabéns, " + player.getName() + " você venceu o game de adivinhação");
    }}
}
