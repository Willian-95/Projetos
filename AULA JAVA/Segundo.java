import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {

        

        Scanner entrada = new Scanner(System.in);
        System.out.println("APENAS NUMEROS INTEIROS!!!");

        System.out.print("Digite o primeiro numero:");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero:");
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;
        

        System.out.println("Resulatado da soma dos dois valores:" + soma);


        entrada.close();
    }

    
}