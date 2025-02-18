public class EnderecoBanco {

    private String logradouro;
    private String numero;
    private String cidade;
    
    public EnderecoBanco() {
    }
    
    public EnderecoBanco(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }



    public String getLogradouro() {
        return logradouro;
    }



    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }



    public String getNumero() {
        return numero;
    }



    public void setNumero(String numero) {
        this.numero = numero;
    }



    public String getCidade() {
        return cidade;
    }



    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



    @Override
    public String toString() {
        return "EnderecoB [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + "]";
    }


    
}
