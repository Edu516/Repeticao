package exercícios;
import java.util.Scanner;
public class Exercício15 {
public static void main (Scanner[] arg){
	Scanner entrada=new Scanner(System.in);
	int soma=0;
	int s=0;
	for(int x=1;x<=37;x++){
		s=(38-x)*(39-x)/x;
				soma=soma+s;
	}
	System.out.println(soma);
}
}