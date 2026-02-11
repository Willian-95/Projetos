

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

    

        System.out.print("Quantos alunos deseja cadastrar:");
        int qntd = entrada.nextInt();
        entrada.nextLine();
        
        Aluno [] alunos = new Aluno [qntd];

       for (int i = 0; i < alunos.length; i++) {
    alunos[i] = new Aluno();

    System.out.println("\nAluno " + (i + 1));

    System.out.print("Digite seu nome: ");
    alunos[i].setNome(entrada.nextLine());

    System.out.print("Digite a primeira nota: ");
    alunos[i].setNota1(entrada.nextDouble());

    System.out.print("Digite a segunda nota: ");
    alunos[i].setNota2(entrada.nextDouble());

    System.out.print("Digite a terceira nota: ");
    alunos[i].setNota3(entrada.nextDouble());

    double media = alunos[i].calcularMedia();

    if (media >= 8) {
        System.out.println("Aluno aprovado");
    } else {
        System.out.println("Aluno reprovado");
    }

    alunos[i].mostrarDados();

    entrada.nextLine(); 
        }
    }
}