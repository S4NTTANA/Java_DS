public class ClienteAt {

    private String Nome;
    private int idade;
    private String CPF;
    private String Endereco;
    private String Telefone;
    public ClienteAt(String nome, int idade, String cPF, String endereco, String telefone) {
        Nome = nome;
        this.idade = idade;
        CPF = cPF;
        Endereco = endereco;
        Telefone = telefone;
    }

    
    public ClienteAt() {
    }


    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }


    @Override
    public String toString() {
        return "\nCliente \nNome: " + Nome + "\nIdade: " + idade + "\nCPF: " + CPF + "\nEndereco: " + Endereco + "\nTelefone: "
                + Telefone + "";
    }

    

}
