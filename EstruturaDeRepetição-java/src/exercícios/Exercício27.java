package exercícios;
import java.util.Scanner;
public class Exercício27 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Lojas Tabajara");
		int x=0;
		int soma=0;
		while(true){
		while(true){
			x=x+1;
			System.out.println("Qual o preço?");
			int preço=entrada.nextInt();
			if(preço==0){
				break;
			}			
			System.out.println("Quantos produtos?");
			int quant=entrada.nextInt();
			soma=quant*preço+soma;
			System.out.println(x+"-"+quant+"- R$ "+quant*preço);
			
	}
		System.out.println("-Total- R$ "+soma);
		System.out.println("Quanto vai pagar?");
		int troco=entrada.nextInt();
					troco=troco-soma;
					System.out.println("Seu troco é de "+troco);	
}
}
}