public class ClienteImpor {

    private String nome;
    private String email;
    private EnderecoImport endereco;
    public ClienteImpor() {
    }
    public ClienteImpor(String nome, String email, EnderecoImport endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public EnderecoImport getEndereco() {
        return endereco;
    }
    public void setEndereco(EnderecoImport endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "ClienteImpor [nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
    }

    
    

}




