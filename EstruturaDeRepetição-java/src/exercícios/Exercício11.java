package exercícios;
import java.util.Scanner;
public class Exercício11 {
public static void main (Scanner[] arg){
	Scanner entrada=new Scanner(System.in);

	int somapar=0;
	int somaimpar=0;
	for(int x=0;x<=10;x++){
			System.out.println("Escreva seu numero");
			int num=entrada.nextInt();
			if(num % 2 == 0){
					somapar=somapar+1;
							}else{
								somaimpar=somaimpar+1;
							}
	}
	}
}
