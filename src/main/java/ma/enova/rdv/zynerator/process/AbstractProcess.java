package ma.enova.rdv.zynerator.process;

public interface AbstractProcess<T extends AbstractProcessInput, K> {
    Result<T,K> execute(T input, K output);
}
