
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       


        Usuario user = new Usuario();

        System.out.print("\n");
        System.out.print("Cadastre seu Email: ");
        String email = entrada.nextLine();

        System.out.print("Cadastre seua senha: ");
        String senha = entrada.nextLine();

        user.setEmail(email);
        user.setSenha(senha, senha);

        System.out.print("\nLOGIN\n");
        System.out.print("\n");

        
        System.out.print("Insira seu Email: ");
        String emailLogin = entrada.nextLine();

        System.out.print("Insira sua senha: ");
        String senhaLogin = entrada.nextLine();

        if(user.validarLogin(emailLogin, senhaLogin)){
            System.out.print("\n");
            System.out.println("LOGIN REALIZADO COM SUCESSO!" );

        }else{
            System.out.println("Email ou Senha incorretos!");
        }

        entrada.close();
    }
}