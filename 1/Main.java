public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina","Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 2, "Diesel", 5);
        Onibus onibus = new Onibus("Mercedes", "O500", 2019, 50, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, 5, "Elétrico", "SUV", 75);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Mercedes", "Actros", 2021, 2, "Diesel", 10, -10);

        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

        System.out.println("Detalhes do Caminhão:");
        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

        System.out.println("Detalhes do Ônibus:");
        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

        System.out.println("Detalhes do Carro Elétrico:");
        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

        System.out.println("Detalhes do Caminhão Refrigerado:");
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
    }
}
