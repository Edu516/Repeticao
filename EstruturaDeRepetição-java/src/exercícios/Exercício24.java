package exercícios;
import java.util.Scanner;
public class Exercício24 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Quantas CDs tem?");
			int n=entrada.nextInt();
			int soma=0;
			for(int x=0;x<=n;x++){
				System.out.println("Qual o valor dos Cds?");
				int num=entrada.nextInt();
					
					
						soma=num+soma;
					}
			
				System.out.println("O valor investido foi: "+soma);
				soma=soma/n;
				System.out.println("Valor medio de gasto de Cds:"+soma);	
			}
	}
