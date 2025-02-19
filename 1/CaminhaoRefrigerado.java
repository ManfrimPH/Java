public class CaminhaoRefrigerado extends Caminhao{

    private float temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, float capacidadeCarga, float temperaturaMinima) {
        super(marca, modelo, ano,capacidadePassageiros,combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia(){
        double autonomia = super.calcularAutonomia();
        return autonomia * 0.9;
    }

}  