import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int n1 = entrada.nextInt();

         System.out.print("Digite o segundo numero:");
         int n2 = entrada.nextInt();

        int soma = n1 + n2;

        System.out.println("Soma:" + soma);

        if(soma % 2 == 0){
            System.out.println("A soma dos dois numeros e pares!");

        }else{
            System.out.println("a soma dos dois numeros e impar!");
        }

         entrada.close();
        
    }
    
}
