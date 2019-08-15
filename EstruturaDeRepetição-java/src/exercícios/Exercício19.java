package exercícios;
import java.util.Scanner;
public class Exercício19 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Qual numero voce deseja");
		 int n=entrada.nextInt();
		 int soma=0;
		 int nvezes=n;
		 
		 for(int varios=0;varios<=nvezes;varios++){
			 if(varios<=1){
				 n=n-1;
			 }
		 for(int x=n;x>0;x--){
			 if(n % x==0){
				 System.out.println("ele é divisivel por "+x);
				 soma=soma+1;
			 }
		 }
		 if(soma<=2){
			for(int x=n;x>0;x--){
				 if(n % x==0){
					 System.out.println("ele é divisivel por "+x);
					 }
			 }
			 System.out.println(n+"É primo"); 
		 }
	}
}
}	