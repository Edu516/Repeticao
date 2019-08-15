package exercícios;
import java.util.Scanner;
public class Exercício13 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Qual o numero que deseja fatorar?");
		int fat=entrada.nextInt();
		int soma=1;
		for(int x=fat;x>0;x--){
			soma=x*soma;
		}
		System.out.println(soma);
	}

}
