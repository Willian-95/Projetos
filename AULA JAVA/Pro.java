


import java.util.Scanner;

public class Pro{

    private String nome;
    private double preco;
    private int quantidade;



    public String getNome(){
        return  nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco(){
        return preco;
    }
    public void setPreco( double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

      public double valorTotal(){
        return preco * quantidade;
    }


    public void mostrarProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Total: " + valorTotal());
    }

    
  
}
