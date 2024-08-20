import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVendas {


    public static void main(String[] args) {
    RelatorioMetodos relatorioMetodos = new RelatorioMetodos();

        List<Double> precos = new ArrayList();
        precos.add(9.8);
        precos.add(10.7);
        precos.add(4.2);
        precos.add(1.7);
        precos.add(5.3);
        precos.add(6.7);
        precos.add(9.4);
        precos.add(3.0);
        precos.add(14.6);
        precos.add(8.2);

        Scanner filtro = new Scanner(System.in);

     Integer percorrer = relatorioMetodos.percorrerUsuario(precos);
        System.out.println(percorrer);

        Double somaVendaRecebe = relatorioMetodos.novoUsuario(precos);
        System.out.println(somaVendaRecebe);

        Double buscarMaiorPreco = relatorioMetodos.novoMaior(precos);
        System.out.println(buscarMaiorPreco);

        Double buscarMenorPreco = relatorioMetodos.novoMenor(precos);
        System.out.println(buscarMenorPreco);

        Double pesquisa = filtro.nextDouble();

        List<Double> buscarMenorFiltro = relatorioMetodos.novoFiltro(precos , pesquisa);
        System.out.println(buscarMenorFiltro);



    }
}
