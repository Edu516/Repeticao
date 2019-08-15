package exercícios;
import java.util.Scanner;
public class Exercício17 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Qual numero voce deseja");
		 int n=entrada.nextInt();
		 int soma=0;
		 for(int x=n;x>0;x--){
			 if(n % x==0){
				 soma=soma+1;
			 }
		 }
		 if(soma>2){
			 System.out.println("Não é primo");
		 }else{
			 System.out.println("É primo"); 
		 }
	}
}