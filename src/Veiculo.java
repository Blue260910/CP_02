public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private boolean ligado;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = 0; // Velocidade máxima padrão
        this.velocidadeAtual = 0; // Começa com velocidade zero
        this.ligado = false; // Começa desligado
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void ligarVeiculo() {
        if (ligado) {
            System.out.println("Veículo já está ligado.");
        }
        this.ligado = true;
    }

    public void desligarVeiculo() {
        if (!ligado) {
            System.out.println("Veículo já está desligado.");
        }
        this.ligado = false;
    }

    public boolean getPower() {
        if (ligado) {
            return true;
        } else {
            return false;
        }
    }

    // Métodos de funcionalidade
    public void acelerar(int incremento) {
        if (!ligado) {
            System.out.println("Veículo desligado.");
            return;
        }
        if (incremento < 0) {
            System.out.println("Aceleração não pode ser negativa.");
            return;
        }
        if (velocidadeAtual + incremento <= velocidadeMaxima) {
            velocidadeAtual += incremento;
        } else {
            System.out.println("Velocidade máxima atingida!");
        }
    }

    public void reduzirVelocidade(int decremento) {
        if (!ligado) {
            System.out.println("Veículo desligado.");
            return;
        }
        if (decremento < 0) {
            System.out.println("Decremento não pode ser negativa.");
            return;
        }
        if (velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
        } else {
            velocidadeAtual = 0;
        }
    }

    public void obterStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Veículo " + (ligado ? "ligado" : "desligado"));

    }
}
