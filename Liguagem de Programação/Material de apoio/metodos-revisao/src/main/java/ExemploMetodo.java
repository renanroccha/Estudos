import java.util.List;

public class ExemploMetodo {

    void apresentarUsuario(String nome){
        System.out.println("""
                Olá %s
                """.formatted(nome));
    }

    void apresentarUsuario(String nome, String sobrenome){
        System.out.println("""
                Olá %s %s
                """.formatted(nome, sobrenome));
    }

    //Para venda de até R$500.0, a taxa é de 20%
    //Acima de 500.00, a taxa é de 40%
    Double calcularTaxaVenda(Double valorDaVenda){
        //
        Double valorTaxa = 0.0;
        if (valorDaVenda <= 500.0){
            valorTaxa = valorDaVenda * 0.2;
        }else {
            valorTaxa = valorDaVenda * 0.4;
        }
        return valorTaxa;
    }

    void exibirNomes(List<String> nomes){
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }
    }
}
