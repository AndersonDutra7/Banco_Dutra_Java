public class TestaCartaoDeCredito {
    public static void main(String[] args) {

        CartaoDeCredito cartaoCredito1 = new CartaoDeCredito();
        CartaoDeCredito cartaoCredito2 = new CartaoDeCredito();

        cartaoCredito1.numero = 2022;
        cartaoCredito1.dataDeValidade = "26/10/2027";

        cartaoCredito2.numero = 1999;
        cartaoCredito2.dataDeValidade = "23/11/2022";

        System.out.println(cartaoCredito1);
        System.out.println(cartaoCredito2);
    }
}
