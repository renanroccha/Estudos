import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {


    Utilitaria utilitaria = new Utilitaria();


        String frutaPesquisada = "Goiaba";
        Boolean existeFruta = false;

        String nomePesquisado = "Maria";
        Boolean existeNome = false;

        List<String> frutas = new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("Carambola");
        frutas.add("Goiaba");
        frutas.add("Goiaba");
        frutas.add("Kiwi");

        System.out.println("Frutas");
        utilitaria.exibirLista(frutas);

        if(existeFruta){
            System.out.println(String.format("A fruta %s existe na lista", frutaPesquisada));
        }
        else {
            System.out.println("A fruta não existe");
        }


        System.out.println();

        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Luan");
        nomes.add("Jean");
        nomes.add("Igor");
        nomes.add("Amanda");

        System.out.println("Nomes");
        utilitaria.exibirListaNome(nomes);

        if(existeNome){
            System.out.println(String.format("Nome %s existe na lista", nomePesquisado));
        }
        else {
            System.out.println(String.format("Nome %s não existe na lista", nomePesquisado));
        }
    }
}
