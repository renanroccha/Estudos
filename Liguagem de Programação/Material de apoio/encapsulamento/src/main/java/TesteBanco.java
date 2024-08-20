public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria(
                "Bob",
                "0123");

        ContaBancaria conta02 = new ContaBancaria();

        conta01.sacar(10.5);
//        System.out.println("Saldo conta 01: " + conta01.saldo);
    }
}
