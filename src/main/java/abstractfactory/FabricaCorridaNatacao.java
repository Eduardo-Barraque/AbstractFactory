package abstractfactory;

public class FabricaCorridaNatacao implements FabricaAbstrata {

    @Override
    public Modalidade createModalidade() {
        return new CorridaNatacao();
    }
}
