public class MainCliente {

    public static void main(String[] args) {
        
        ClienteAt cliente = new ClienteAt("Marta", "Marta@gmail.com", "marta123");
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Senha: " + cliente.getSenha());

        ClienteAt cliente2 = new ClienteAt();

        cliente2.setNome("Luiza");
        cliente2.setEmail("luiza@gmail.com");
        cliente2.setSenha("luiza123");

        System.out.println("\nNome: " + cliente2.getNome());
        System.out.println("Email: " + cliente2.getEmail());
        System.out.println("Senha: " + cliente2.getSenha());

        System.out.println("\n");

        ClienteAt cliente3 = new ClienteAt("José", "José@gamil.com", "jose123");
        System.out.println(cliente3.toString());

    
    

    }

}
