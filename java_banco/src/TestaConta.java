public class TestaConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();
        Conta conta4 = new Conta();

        conta1.numero = 999;
        conta1.saldo = 4000.00;
        conta1.limite = 10000.;

        conta2.numero = 777;
        conta2.saldo = 0.85;
        conta2.limite = 0;

        conta3.numero = 555;
        conta3.saldo = 50;

        conta4.numero = 111;
        conta4.saldo = 600.43;

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);

        conta1.depositar(500);
        System.out.println(conta1);

        conta2.sacar(500);
        System.out.println(conta2);

        conta2.sacar(0.85);
        System.out.println(conta2);

        System.out.println("O saldo disponível em sua conta é: R$ " + conta3.consultarSaldoDisponivel());

        conta4.imprimirExtrato();
    }
}
