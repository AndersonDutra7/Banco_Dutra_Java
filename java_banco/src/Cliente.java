public class Cliente {

    public String nome;
    public int codigo;

    @Override
    public String toString() {
        return "Cliente " + codigo + ": Nome: " + nome;
    }
}
