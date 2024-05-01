public class Caminhao extends Veiculo {
    private double cargaMaxima;
    private double carga;

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.cargaMaxima = 1000;
        this.carga = 0;
        this.setVelocidadeMaxima(100);
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCarga(double carga) {
        if ((carga > cargaMaxima) || (carga < 0)){
            System.out.println("Carga nâo permitida");
        } else {
            this.carga = carga;
        }
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Carga: " + carga + " kg");
        System.out.println("Carga máxima: " + cargaMaxima + " kg");
    }
}
