/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios;

import java.util.Scanner;

public class Exercício2 {
    public static void main (String[]Args){
        
    Scanner entrada = new Scanner(System.in);
        String senha = "";
        String nome = "";
        while (true) {
            System.out.println("Escreva seu nome");
            nome = entrada.nextLine();
            System.out.println("Escreva sua senha");
            senha = entrada.nextLine();
            if (nome.equals(senha)) {
                System.out.println("ERROR,repita");
            } else {
                break;
            }
        }
}
}