package exercícios;
import java.util.Scanner;
public class Exercício12 {
public static void main (Scanner[] arg){
	Scanner entrada=new Scanner(System.in);
	System.out.println("Escreva o numero que quer");
	int num=entrada.nextInt();
	int soma=1;
	int ante=0;
	for(int x=0;x==num;x++){
		
		soma=soma+ante;
		ante=soma;
		System.out.println(soma);
		
	}
	}
}

