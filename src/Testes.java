

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testes {
// -------------------------------------------------- T E S T E S   C A R R O S -------------------------------------------------- //
    @Test
    public void test_LigarArCondicionadoCarroOff() {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.ligarArCondicionado();
        carro.obterStatus();
        assertFalse(carro.ligarArCondicionado());
    }

    @Test
    public void test_LigarArCondicionadoCarroOn() {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.acelerar(50);
        carro.ligarArCondicionado();
        carro.obterStatus();
        assertTrue(carro.ligarArCondicionado());
    }

    @Test
    public void test_DesligarArCondicionadoCarroOn() {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.acelerar(50);
        carro.ligarArCondicionado();
        carro.desligarArCondicionado();
        carro.obterStatus();
        assertTrue(carro.desligarArCondicionado());
    }

// -------------------------------------------------- T E S T E S   M O T O S -------------------------------------------------- //

    @Test
    public void test_EmpinarMoto() {
        Moto moto = new Moto("Honda", "CG 125", 2019);
        moto.acelerar(30);
        moto.empinar();
        moto.obterStatus();
        assertTrue(moto.empinar());
    }

    @Test
    public void test_EmpinarMotoFalhaMenor() {
        Moto moto = new Moto("Honda", "CG 125", 2019);
        moto.acelerar(10);
        moto.empinar();
        moto.obterStatus();
        assertFalse(moto.empinar());
    }

    @Test
    public void test_EmpinarMotoFalhaMaior() {
        Moto moto = new Moto("Honda", "CG 125", 2019);
        moto.acelerar(100);
        moto.empinar();
        moto.obterStatus();
        assertFalse(moto.empinar());
    }


    @Test
    public void test_AcelerarMoto() {
        Moto moto = new Moto("Honda", "CG 125", 2019);
        moto.acelerar(30);
        moto.obterStatus();
        assertEquals(30, moto.getVelocidadeAtual());
    }


// -------------------------------------------------- T E S T E S   C A M I N H A O -------------------------------------------------- //

    @Test
    public void test_AcelerarCaminhao() {
        Caminhao caminhao = new Caminhao("Volvo", "FH 460", 2022);
        caminhao.obterStatus();
        caminhao.acelerar(80);
        assertEquals(80, caminhao.getVelocidadeAtual());
    }

    @Test
    public void test_Caminhao() {
        Caminhao caminhao = new Caminhao("Volvo", "FH 460", 2022);
        assertEquals("Volvo", caminhao.getMarca());
        assertEquals("FH 460", caminhao.getModelo());
        assertEquals(2022, caminhao.getAno());
        assertEquals(100, caminhao.getVelocidadeMaxima());
        assertEquals(1000, caminhao.getCargaMaxima());
    }

    @Test
    public void test_CaminhaoCarga() {
        Caminhao caminhao = new Caminhao("Volvo", "FH 460", 2022);
        caminhao.setCarga(500);
        caminhao.obterStatus();
        assertEquals(500, caminhao.getCarga());
    }

    @Test
    public void test_CaminhaoCargaFalha() {
        Caminhao caminhao = new Caminhao("Volvo", "FH 460", 2022);
        caminhao.setCarga(1500);
        caminhao.obterStatus();
        assertEquals(0, caminhao.getCarga());
    }
    
    // -------------------------------------------------- T E S T E S   V E I C U L O S  -------------------------------------------------- //

    @Test
    public void test_Veiculo() {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.acelerar(50);
        carro.obterStatus();

        carro.reduzirVelocidade(20);
        assertEquals(30, carro.getVelocidadeAtual());
    }

    @Test
    public void testGettersAndSetters() {
        Carro carro = new Carro("Fiat", "Palio", 2020);

        carro.setMarca("Marca");
        assertEquals("Marca", carro.getMarca());

        carro.setModelo("Modelo");
        assertEquals("Modelo", carro.getModelo());

        carro.setAno(2022);
        assertEquals(2022, carro.getAno());
    }

    @Test
    public void testVelocidadeMaxima() {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.setVelocidadeMaxima(200);
        carro.acelerar(210);
    }

    @Test
    public void testVelocidadeNegativa() {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.acelerar(10);
        carro.reduzirVelocidade(20);
        assertEquals(0, carro.getVelocidadeAtual());
    }

}