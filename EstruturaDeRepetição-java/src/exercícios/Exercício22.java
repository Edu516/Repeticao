package exercícios;
import java.util.Scanner;
public class Exercício22 {
	public static void main(Scanner[] arg){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Quantos votantes estao presentes:");
		int n=entrada.nextInt();
		int somaa=0,somab=0,somac=0;
		for(int x=0;x<=n;x++){
		System.out.println("Para votar no candidato A,vote 1,no candidato B,vote 2,no candidato C,vote 3");
		int vot=entrada.nextInt();
		if(vot==1){
			somaa=somaa+1;
		}else if(vot==2){
				somab=somab+1;
		}else if(vot==3){
			somac=somac+1;
		}
	}
		System.out.println("O candidato A recebeu:"+somaa+"votos,O candidato B recebeu: "+somab+" votos, O candidato C recebeu: "+somac+" votos."); 
}
}