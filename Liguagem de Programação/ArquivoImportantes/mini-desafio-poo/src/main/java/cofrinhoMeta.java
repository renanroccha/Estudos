import java.util.concurrent.ThreadLocalRandom;

public class cofrinhoMeta {


    // atrinutos

    String descricao;

    Double valorDeposito = 0.0;

    Boolean quebrado = true;

    Double cofre = 0.0;

    void valorDepositado(Double valorDeposito) {
        if (quebrado) {
            cofre += valorDeposito;
        } else {
            System.out.println("Cofrinho quebrado");
        }

    }
    Double numAleatorio;
    void agitarCofrinho(){
      numAleatorio =  ThreadLocalRandom.current().nextDouble(0,10);
    }



}
