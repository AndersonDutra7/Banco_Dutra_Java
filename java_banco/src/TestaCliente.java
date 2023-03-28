public class TestaCliente {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();

    cliente1.nome = "Anderson";
    cliente1.codigo = 1;

    cliente2.nome = "Thalyta";
    cliente2.codigo = 2;

    System.out.println(cliente1);
    System.out.println(cliente2);

    }
}
