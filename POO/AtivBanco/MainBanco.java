public class MainBanco {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("457893", "Marta",  new EnderecoBanco( "Rua A", "1", "Salvador"), "12345678", "marta@gmail.com", new ContaBancaria());

        System.out.println(funcionario.toString());
    }

}
