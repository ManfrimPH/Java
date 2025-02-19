public class Caminhao extends Veiculo{

    private float capacidadeCarga;
    private float tanque;
    private float consumo;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, float capacidadeCarga) {
        super(marca, modelo, ano,capacidadePassageiros,combustivel);
        this.capacidadeCarga = capacidadeCarga;
        this.tanque = 300;
        this.consumo = 6;
    }

    @Override
    public double calcularAutonomia(){

        if(this.capacidadeCarga > 25){
            this.capacidadeCarga = 25;
        }
        this.consumo = this.consumo * (1-(this.capacidadeCarga/100));
        return this.tanque * this.consumo;
    }

}  