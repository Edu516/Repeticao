/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios;

import java.util.Scanner;
public class Exercício1 {
    public static void main (String[] arg){
		Scanner entrada =new Scanner(System.in);
		
		int num=0;
		while(true){
			System.out.println("Escreva seu numero entre 0 até 10");
			num=entrada.nextInt();
			if (num>=0 && num<=10){
				System.out.println(num);
				break;
			}else
			{
				System.out.println("VocÊ errou,digite novamente");
			}
		}
		
	}
}

