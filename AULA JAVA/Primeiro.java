

import java.util.Scanner;

 public class Primeiro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?");

        int idade = entrada.nextInt();

        if (idade >=18){
        System.out.println("MAIOR DE IDADE!");
        }else{
            System.out.println("VOCE E MENOR DE IDADE");
        }

        entrada.close();
       
    }
}