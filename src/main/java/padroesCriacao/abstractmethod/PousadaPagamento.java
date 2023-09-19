package padroesCriacao.abstractmethod;

public class FabricaPagamento implements FabricaAbstrata{
    @Override
    public Financa criaFinanca() {
        return new Pagamento();
    }
}
