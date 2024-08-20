import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Bob da silva");
        nomes.add("José");
        nomes.add("Maria");

        ExemploMetodo exemploMetodo = new ExemploMetodo();

        exemploMetodo.exibirNomes(nomes);
    }
}
