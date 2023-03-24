package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorredorTest {

    @Test
    void deveInformarCorridadeRua() {
        FabricaAbstrata fabrica = new FabricaCorridadeRua();
        Corredor corredor = new Corredor(fabrica);
        assertEquals("Modalidade de corrida de asfalto", corredor.informarModalidade());
    }

    @Test
    void deveEmitirHistoricoPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaCorridaNatacao();
        Corredor corredor = new Corredor(fabrica);
        assertEquals("Modalidade de corrida Aquatica", corredor.informarModalidade());
    }

}
