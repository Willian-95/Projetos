import java.util.Scanner;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Quantos produtos deseja cadastrar:");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        Pro [] produtos = new Pro[quantidade];
        
        double totalGeral = 0;

       for(int i = 0; i <produtos.length; i++ ){
        produtos [i] = new Pro();

        System.out.println("Produto: " + (i + 1));
       
        
        System.out.println("Digite o nome do produto que deseja cadastrar:");
        produtos[i].setNome(entrada.nextLine());

        System.out.println("Digite o valor do produto:");
        produtos[i].setPreco(entrada.nextDouble());


        System.out.println("Digite a quantidade de produtos:");
        produtos[i].setQuantidade(entrada.nextInt());

        entrada.nextLine();
       

       }
       
       for(int i = 0; i <produtos.length; i++ ){
        totalGeral += produtos[i].valorTotal();
       }

       System.out.println("O valor total de todos os produtos ficou: " + totalGeral);
        
    }
    
}
