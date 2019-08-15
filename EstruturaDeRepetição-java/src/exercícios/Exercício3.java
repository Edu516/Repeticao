package exercícios;
import java.util.Scanner;
public class Exercício3 {
    
	public static void main(String[] arg){ 
		Scanner entrada=new Scanner(System.in);
		String nome="";
		int id=-1;
		char sexo = 'x';
		char est_civil ='x';
		float sal=-1;
		while(nome.length() < 3 && id < 0 && sexo != 'f' && sexo != 'm' && sal <0 && est_civil !='s' && est_civil !='v' && est_civil !='c' && est_civil !='d'  ){
			System.out.println("Digite seu nome:");
			nome=entrada.nextLine();
			System.out.println("Digite sua idade");
			id=entrada.nextInt();
			entrada = new Scanner(System.in);
			System.out.println("Digite seu sexo correspondente a : 'f' ou 'm'");
			sexo= entrada.nextLine().charAt(0);
			System.out.println("Digite seu estado civil,correspondente a 's', 'c', 'v', 'd'");
			est_civil=entrada.nextLine().charAt(0);
			System.out.println("Qual seu salario?");
			sal=entrada.nextFloat();
		}
	}
}
