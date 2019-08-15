package exercícios;
import java.util.Scanner;
public class Exercício10 {
public static void main (Scanner[] arg){
	Scanner entrada=new Scanner(System.in);
	System.out.println("Escreva a base");
	int base=entrada.nextInt();
	System.out.println("Escreva o expoente");
	int expo=entrada.nextInt();
	int soma=1;
	for(int x=0;x<=expo;x++){
			soma=base*soma;
			System.out.println(soma);
	}
	}
}
