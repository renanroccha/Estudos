import java.util.List;

public class ExemploMetodo {


    //sobrecarga

    void apresentarUsuario(String nome){  //assinatura do metodo

        System.out.println("""
                Olá %s""".formatted(nome));

    }

    Double calcularTaxaVenda(Double valorDaVenda){
        Double valorTaxa;
        if (valorDaVenda <= 500){
            valorTaxa = valorDaVenda * 0.2;
        }else {
            valorTaxa = valorDaVenda * 0.4;
        }
            return valorTaxa * 0.4;


    }

    void exibirNomes(List<String> nomes){
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome:" + nomes.get(i));

        }
    ExemploMetodo exemploMetodo = new ExemploMetodo();

        exemploMetodo.exibirNomes(nomes);
    }
    }




