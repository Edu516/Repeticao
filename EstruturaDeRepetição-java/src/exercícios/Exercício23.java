package exercícios;
import java.util.Scanner;
public class Exercício23 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Quantas turmas tem?");
			int n=entrada.nextInt();
			int soma=0;
			for(int x=0;x<=n;x++){
				System.out.println("Quantos alunos tem?");
				int num=entrada.nextInt();
					if(num>40){
						System.out.println("erro,repita");
						x=x-1;
					}else if(num<=40){
						soma=num+soma;
					}
				soma=soma/n;
				}
			System.out.println("numero medio de alunos em sala:"+soma);	
	}
}