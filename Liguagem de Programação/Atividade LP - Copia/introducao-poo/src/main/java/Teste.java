import java.util.List;

public class Teste {
    public static void main(String[] args) {


        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Maria Eduarda";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Bob da silva";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "B002";

        bilhete01.carregar(42.0);
        System.out.println("Saldo atual: " + bilhete01.saldo);

    }
}
