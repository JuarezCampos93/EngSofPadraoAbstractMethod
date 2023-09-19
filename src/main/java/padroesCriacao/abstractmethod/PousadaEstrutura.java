package padroesCriacao.abstractmethod;

public class FabricaEstrutura implements FabricaAbstrata{

    @Override
    public Financa criaFinanca() {
        return new Estrutura();
    }
}
