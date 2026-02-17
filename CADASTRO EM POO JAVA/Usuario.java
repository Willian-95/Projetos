public class Usuario {

    private String email;
    private String senha;

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String Senha, String senha){
        this.senha = senha;
    }
    


    public boolean validarLogin(String gmailDigitado, String senhaDigitada){
        return email.equals(gmailDigitado) && senha.equals(senhaDigitada);
    }
}
