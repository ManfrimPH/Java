public class Onibus extends Veiculo{

    private float quantidadeEixo;
    private float tanque;
    private float consumo;
    
    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, float quantidadeEixo) {
        super(marca, modelo, ano,capacidadePassageiros,combustivel);
        if(quantidadeEixo < 6 || quantidadeEixo > 8){
            return ;
        }
        this.quantidadeEixo = quantidadeEixo;
        this.tanque = 200;
        this.consumo = 5;
    }

    @Override
    public double calcularAutonomia(){
        return this.tanque * this.consumo;
    }

}  