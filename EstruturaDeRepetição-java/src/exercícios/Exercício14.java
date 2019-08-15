package exercícios;
import java.util.Scanner;
public class Exercício14 {
public static void main (Scanner[] arg){
	Scanner entrada=new Scanner(System.in);
	System.out.println("diga a quantidade de termos da serie");	
	int num = entrada.nextInt();
		System.out.print("1/1 + ");	
	for ( int k =1; k<=num;k++){
			System.out.print(k+1+"/"+(k*2+1)+" + " );
		}
}

}