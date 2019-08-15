package exercícios;
import java.util.Scanner;
public class Exercício29 {
    public static void main(String[]Args){
        Scanner entrada = new Scanner(System.in);
        int num, começa, termina, aux;
        
        System.out.print("Montar tabuada de: ");
        num=entrada.nextInt();
        System.out.print("Começar por: ");
        começa=entrada.nextInt();
        System.out.print("Termina em: ");
        termina=entrada.nextInt();
               
        if (começa>termina){
            aux=começa;
            começa=termina;
            termina=aux;
        }
        System.out.println("começa:" + começa + "termina : " + termina);
        for (int x = começa; x<=termina;x++){
            System.out.println(num + " X " + x + " = " + num*x);
            }
    }
}
