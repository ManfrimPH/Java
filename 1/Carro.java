public class Carro extends Veiculo{

    private String tipoCarro;
    private float tanque;
    private float consumo;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano,capacidadePassageiros,combustivel);
        this.tipoCarro = tipoCarro;
        this.tanque = 50;
        this.consumo = 12;
    }

    @Override
    public double calcularAutonomia(){
        return this.tanque * this.consumo;
    }

}  