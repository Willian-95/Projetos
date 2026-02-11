import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int notas [] = new int [2];
        String alunos [] = new String [2];
        int soma = 0;


        for(int i = 0; i <notas.length; i++){
            System.out.print("Digite a nota do aluno:");
            notas[i] = entrada.nextInt();
            soma += notas[i];
       
            
        }
         double media = (double)soma / 2;

        entrada.nextLine();    
        for(int i = 0; i <alunos.length; i++){
            System.out.print("Digite o nome do aluno:");
            alunos [i] = entrada.nextLine();
        }
        
        int maiornota = notas[0];
        int indicemaior = 0;

        for(int i = 0; i <notas.length; i++ ){
            if(notas [i] > maiornota){
                maiornota = notas[i];
                indicemaior = i;
            }
                
        }
        
        for(int i = 0; i <notas.length; i++){
             System.out.println(alunos [i] + " media da turma : " + notas[i]);
        }

        System.out.print("Aluno com a maior media:" + alunos[indicemaior] + "\nNota:" + maiornota);
         System.out.print("media da turma:" + media);
        entrada.close();

    }
    
}
