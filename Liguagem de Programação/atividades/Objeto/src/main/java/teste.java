import java.util.ArrayList;
import java.util.List;

public class teste {

    public static void main(String[] args) {
      //criar um objeto = instanciar um objeto
        //fazemos uma instância usando o new


        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Bob da Silva";
        bilhete01.saldo = 0.0;

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Xampson";
        bilhete02.saldo = 0.0;

        bilhete01.carregar(42.0);
        System.out.println("Saldo B1: " + bilhete01.saldo);

    }
}
