public class CartaoDeCredito {

    public int numero;
    public String dataDeValidade;

    @Override
    public String toString() {
        return "Cartao De Credito " + numero + ": dataDeValidade: " + dataDeValidade;
    }
}
