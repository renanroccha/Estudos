public class BilheteUnico {


    // ORIENTAÇÃO A OBJETOS

    // atributos - caracteristicas

    String nomeTitular;

    Double saldo;

    String codigo;


    // metodos - comportamentos

    void carregar(Double valorRecarga) {
        if (valorRecarga <= 0) {
            System.out.println("Valor inválido");
        } else {
            saldo += valorRecarga;
            System.out.println("Recarga efetuada");
        }
    }


}
