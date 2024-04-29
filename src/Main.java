public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        Moto moto = new Moto("Honda", "CG 125", 2019);
        Caminhao caminhao = new Caminhao("Volvo", "FH 460", 2022);

        // Testando funcionalidades
        carro.acelerar(50);
        carro.ligarArCondicionado();
        carro.obterStatus();

        System.out.println();

        moto.acelerar(30);
        moto.empinar();
        moto.obterStatus();

        System.out.println();

        caminhao.setCarga(500);
        caminhao.acelerar(80);
        caminhao.obterStatus();

        System.out.println();
    }
}
