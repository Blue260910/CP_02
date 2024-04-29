public class Moto extends Veiculo {
    private boolean empinando;
    

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.setVelocidadeMaxima(120); // Velocidade máxima padrão
        empinando = false;
    }

    public boolean empinar() {
        if (getVelocidadeAtual() > 20 && getVelocidadeAtual() < 50) {
            System.out.println("Moto empinando!");
            empinando = true;
            return true;
        } else {
            empinando = false;
            System.out.println("Velocidade não adequada para empinar.");
            return false;
        }
    }

    @Override
    public void obterStatus() {
    super.obterStatus();
        System.out.println("Moto: " + (empinando ? "Empinando" : "Andando normalmente"));
    }
}
