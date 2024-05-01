public class Carro extends Veiculo {
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.arCondicionado = false; // Ar condicionado desligado por padrão
        this.setVelocidadeMaxima(180); // Velocidade máxima padrão
    }

    public boolean ligarArCondicionado() {
        if (getPower()) {
            arCondicionado = true;
            System.out.println("Ar condicionado ligado.");
            return true;
        } else {
            System.out.println("Ligue o carro primeiro para ligar o ar condicionado.");
            return false;
        }
    }

    public boolean desligarArCondicionado() {
        arCondicionado = false;
        System.out.println("Ar condicionado desligado.");
        return true;
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Ar condicionado: " + (arCondicionado ? "ligado" : "desligado"));
    }
}
