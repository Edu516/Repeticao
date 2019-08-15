package exercícios;
import java.util.Scanner;
public class Exercício20 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Quantas notas voce tem?");
		float n=entrada.nextFloat();
		float soma=0;
		for(int x=0;x>=n;x++){
	System.out.println("Qual sua nota?");
	int nota=entrada.nextInt();
		soma=nota+soma;
		
	}
		soma=soma/n;
		System.out.println("Sua média é "+soma);	
	}
}
