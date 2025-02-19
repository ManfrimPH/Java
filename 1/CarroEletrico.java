public class CarroEletrico extends Carro{
    
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo,int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        double consumoPorKWh = 5;
        return bateriaKWh * consumoPorKWh;
    }
}
