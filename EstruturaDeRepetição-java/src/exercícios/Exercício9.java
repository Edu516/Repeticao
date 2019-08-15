package exercícios;
import java.util.Scanner;
public class Exercício9 {
public static void main (Scanner[] arg){
	Scanner entrada=new Scanner(System.in);
	int num=0;
	System.out.println("Qual seu numero:");
	num=entrada.nextInt();
	System.out.println("A Tabuada do "+num);
	for(int x=1;x>=10;x++){
		int soma=0;
		soma=x*num;
				System.out.println(+x+" * "+num+" = "+soma);		
	}
	
	}
}