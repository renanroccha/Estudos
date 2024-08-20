import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class Utilitaria {

    // CRIANDO METODOS
    // COMO DECLARAR UM MÉTODO

    void exibirMensagem() {
        System.out.println("Olá, Mundo");
    }

    Integer somar(Integer numero1, Integer numero2){
        return numero1+numero2;
    }

    void exibirLista(List<String> lista){
        // recber a lista
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
            }
    }

    void exibirListaNome(List<String> lista){
        for (int i=0; i<lista.size(); i++ ){
            System.out.println(lista.get(i));
        }
    }

}

