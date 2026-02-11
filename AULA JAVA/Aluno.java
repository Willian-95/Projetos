
import java.util.Scanner;


public class Aluno {

       private String nome;
       private double nota1;
       private double nota2;
       private double nota3;

        

       public String getNome(){
        return nome;
       }
       public void setNome(String nome){
        this.nome = nome;
       }

       public double getNota1(){
        return nota1;
       }
       public void setNota1(double nota){
        this.nota1 = nota;
       }

       
       public double getNota2(){
        return nota2;
       }
       public void setNota2(double nota){
        this.nota2 = nota;
       }

       
       public double getNota3(){
        return nota3;
       }
       public void setNota3(double nota){
        this.nota3 = nota;
       }

       public double calcularMedia(){
        return(nota1 + nota2 + nota3) / 3;
       }

       public boolean isAprovado(){
        return calcularMedia() >=8;
       }
      public String getSituacao(){
        return calcularMedia() >=8 ? "Aprovado" : "Reprovado";
      }
       

    public void mostrarDados(){
        System.out.println("\nnome: " + nome);
        System.out.println("nota1: " + nota1);
        System.out.println("nota2: " + nota2);
        System.out.println("nota3: " + nota3);
        System.out.printf("Media: %.2f%n", calcularMedia());
         System.out.println("Situacao: " + getSituacao());
        }
       }

    
    
