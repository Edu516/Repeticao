package exercícios;
import java.util.Scanner;
public class Exercício16 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Quantos elementos tem no conjunto");
		 int n=entrada.nextInt();
		 
		 int maior_val=0;
		 int soma=0;
		 int num=0;
		 for(int x=0;x<=n;x++){
			 System.out.println("Digite o numero");
			 num=entrada.nextInt();
			 int menor_val=0;
			 
			 soma=num+soma;
			 if(num<menor_val){
				 menor_val=num;
			 }else if(num>maior_val){
				 maior_val=num;
					 
			 }
		 }
	}
}