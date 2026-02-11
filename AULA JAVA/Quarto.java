import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo numero:");
        int n2 = entrada.nextInt();

        System.out.print("Digite o terceiro numero:");
        int n3 = entrada.nextInt();

        if(n1 >= n2 && n1 >=n3){
            System.out.println("O numero " + n1 +" maior!" );
            
        } else if( n2 >=n1 && n2 >=n3){
            System.out.println("O numero " + n2 + " maior!");

        }else{
            System.out.println("O numero " + n3 + " maior!");
        }


        entrada.close();
    }
    
}
