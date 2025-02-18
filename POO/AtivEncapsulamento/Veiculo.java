public class Veiculo {

    private String Placa;
    private String Cor;
    private int N_Passageiros;
    private String Cap_Tanque;
    private String Vel_Max;
    private String Cons_Medio;
    public Veiculo(String placa, String cor, int n_Passageiros, String cap_Tanque, String vel_Max, String cons_Medio) {
        Placa = placa;
        Cor = cor;
        N_Passageiros = n_Passageiros;
        Cap_Tanque = cap_Tanque;
        Vel_Max = vel_Max;
        Cons_Medio = cons_Medio;
    }
    public Veiculo() {
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public int getN_Passageiros() {
        return N_Passageiros;
    }
    public void setN_Passageiros(int n_Passageiros) {
        N_Passageiros = n_Passageiros;
    }
    public String getCap_Tanque() {
        return Cap_Tanque;
    }
    public void setCap_Tanque(String cap_Tanque) {
        Cap_Tanque = cap_Tanque;
    }
    public String getVel_Max() {
        return Vel_Max;
    }
    public void setVel_Max(String vel_Max) {
        Vel_Max = vel_Max;
    }
    public String getCons_Medio() {
        return Cons_Medio;
    }
    public void setCons_Medio(String cons_Medio) {
        Cons_Medio = cons_Medio;
    }
    @Override
    public String toString() {
        return "Veiculo \nPlaca: " + Placa + "\nCor: " + Cor + "\nNúmero de Passageiros: " + N_Passageiros + "\nCapacidade do Tanque: "
                + Cap_Tanque + "\nVelocidade Máxima: " + Vel_Max + "\nConsumo Medio: " + Cons_Medio + "";
    }

    

}