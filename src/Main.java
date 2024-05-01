public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        Moto moto = new Moto("Honda", "CG 125", 2019);
        Caminhao caminhao = new Caminhao("Volvo", "FH 460", 2022);

        // Testando funcionalidades
        carro.ligarVeiculo();
        carro.acelerar(50);
        carro.ligarArCondicionado();
        carro.obterStatus();

        System.out.println("-------------------------------------");

        moto.ligarVeiculo();
        moto.acelerar(30);
        moto.empinar();
        moto.obterStatus();

        System.out.println("-------------------------------------");

        caminhao.ligarVeiculo();
        caminhao.setCarga(500);
        caminhao.acelerar(80);
        caminhao.obterStatus();

        System.out.println("-------------------------------------");
    }
}
