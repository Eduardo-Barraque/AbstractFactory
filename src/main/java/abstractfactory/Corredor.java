package abstractfactory;

public class Corredor {

    private Modalidade modalidade;

    public Corredor(FabricaAbstrata fabrica) {
        this.modalidade = fabrica.createModalidade();
    }

    public String informarModalidade() {
        return this.modalidade.informar();
    }

}
