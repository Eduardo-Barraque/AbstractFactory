package abstractfactory;

public class FabricaCorridadeRua implements FabricaAbstrata {

    @Override
    public Modalidade createModalidade() {
        return new CorridadeRua();
    }

}
