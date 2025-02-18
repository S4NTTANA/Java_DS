public class Cliente {
    private String Nome;
    private String Email;
    private String senha;

    
    public Cliente() {
    }
    
    public Cliente(String nome, String email, String senha) {
        Nome = nome;
        Email = email;
        this.senha = senha;
    }
    public String getNome() {
        return Nome;
    }
    public String getEmail() {
        return Email;
    }
    public String getSenha() {
        return senha;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente [Nome=" + Nome + ", Email=" + Email + ", senha=" + senha + "]";
    }

    

}
