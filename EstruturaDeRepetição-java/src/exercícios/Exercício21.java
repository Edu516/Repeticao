package exercícios;
import java.util.Scanner;
public class Exercício21 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Quantas pessoas vao ser avaliadas?");
		float n=entrada.nextFloat();
		float soma=0;
		for(int x=0;x>=n;x++){
	System.out.println("Qual sua idade?");
	int id=entrada.nextInt();
		soma=id+soma;
		
	}
		soma=soma/n;
		if(soma<=25){
				System.out.println("A media de idade é jovem");
					}else if(soma>25 && soma<=60){
					System.out.println("A media de idade é adulta");
					}else if(soma>60){
						System.out.println("A media de idade é velho");
						}
		System.out.println("Sua média é "+soma);	
	}
}
