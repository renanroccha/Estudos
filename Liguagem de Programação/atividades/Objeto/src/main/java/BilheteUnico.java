public class BilheteUnico {


    //Atributos = caracteristicas
    String nomeTitular;
    Double saldo;

    //Metodos = comportamentos
    void carregar(Double valorRecarga){

        saldo += valorRecarga;

        if (valorRecarga <= 0){
            System.out.println("Valor Inválido");
        }else {
            saldo += valorRecarga;
            System.out.println(nomeTitular + " Recarga efetuada");
        }


    }



}
