public class MainAtiv {

    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo("ZNX-459", "Preto", 12, "450L", "120km/h", "9L/km");
        System.out.println(veiculo.toString());

        ClienteAt cliente = new ClienteAt("Maria", 18, "123.456.789.00", "Salvador", "71 9 8181-1414");
        System.out.println(cliente.toString());

    }

}
