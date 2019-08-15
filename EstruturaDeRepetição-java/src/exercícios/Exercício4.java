
package exercícios;
import java.util.Scanner;
public class Exercício4 {
    public static void main(String[] arg){
	Scanner entrada=new Scanner(System.in);
		float popa=0;
		float popb=0;
		float taxa=0;
		float taxab=0;
		int x=0;
			System.out.println("Qual a populaçao da cidade a");
			popa=entrada.nextFloat();
			System.out.println("Qual a população da cidade b");
			popb=entrada.nextFloat();
			System.out.println("Qual a taxa de crescimento de a");
			taxa=entrada.nextFloat();
			System.out.println("Qual a taxa de crescimento de b");
			taxab=entrada.nextFloat();
			float somaa=popa;
			float somab=popb;
			while(true){
					somab=somab+somab*taxab;
					somaa=somaa+somaa*taxa;
					if(somaa>=somab){
						x=x+1;
						break;
					
					}
			}
			System.out.println("levou esses anos:"+x);
}
}