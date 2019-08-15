package exercícios;
import java.util.Scanner;
public class Exercício7 {
public static void main(String[] arg){
	Scanner entrada=new Scanner(System.in);
	int num1=0;
	int num2=0;
	System.out.println("Qual o primeiro numero?");
	num1=entrada.nextInt();
	System.out.println("Qual o segundo numero?");
	num2=entrada.nextInt();
	
	if(num1<num2){
	
	for(int x=num1+1;x<num2;x++){
				System.out.println(x);
		}
			}
	if(num2<num1){
		for(int x=num2+1;x<num1;x++){
				
				System.out.println(x);
			}
	}
}
}