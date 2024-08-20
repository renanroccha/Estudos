import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {
    Integer percorrerUsuario(List<Double> precos) {
        return precos.size();
    }


    Double somaDeVendas = 0.0;

    Double novoUsuario(List<Double> precos) {
        for (int i = 0; i < precos.size(); i++) {
            somaDeVendas += precos.get(i);

        }
        return somaDeVendas;
    }

    Double novoMaior(List<Double> precos) {
        Double numeroMaior = 0.0;
        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) > numeroMaior) {
                numeroMaior = precos.get(i);
            }
        }
        return numeroMaior;
    }

    Double novoMenor(List<Double> precos) {
        Double numeroMenor = precos.get(0);
        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) < numeroMenor) {
                numeroMenor = precos.get(i);
            }
        }
        return numeroMenor;


    }

    List<Double> novoFiltro(List<Double> precos , Double pesquisa) {
        List<Double> numeroFiltro = new ArrayList();
        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) >= pesquisa) {
                numeroFiltro.add(precos.get(i));
            }
        }
        return numeroFiltro;
    }
}




