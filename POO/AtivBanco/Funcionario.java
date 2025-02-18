public class Funcionario {

    private String CodigoFunc;
    private String Nome;
    private EnderecoBanco enderecoBanco;
    private String Telefone;
    private String Email;
    private ContaBancaria contaBancaria;
    public Funcionario() {
    }
    public Funcionario(String codigoFunc, String nome, EnderecoBanco enderecoBanco, String telefone, String email,
            ContaBancaria contaBancaria) {
        CodigoFunc = codigoFunc;
        Nome = nome;
        this.enderecoBanco = enderecoBanco;
        Telefone = telefone;
        Email = email;
        this.contaBancaria = contaBancaria;
    }
    public String getCodigoFunc() {
        return CodigoFunc;
    }
    public void setCodigoFunc(String codigoFunc) {
        CodigoFunc = codigoFunc;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public EnderecoBanco getEnderecoBanco() {
        return enderecoBanco;
    }
    public void setEnderecoBanco(EnderecoBanco enderecoBanco) {
        this.enderecoBanco = enderecoBanco;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }
    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    @Override
    public String toString() {
        return "Funcionario [CodigoFunc=" + CodigoFunc + ", Nome=" + Nome + ", enderecoBanco=" + enderecoBanco
                + ", Telefone=" + Telefone + ", Email=" + Email + ", contaBancaria=" + contaBancaria + "]";
    }

    

}
