import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        //essa não é só uma variável e sim um objeto!
        //instânciar = criar um objeto, ou seja, usar o new
        ExemploMetodo exemploMetodo = new ExemploMetodo();

        exemploMetodo.apresentarUsuario("Bob");
        exemploMetodo.apresentarUsuario("Bob", "da Silva");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de venda:");
        Double valorVendaDigitado = leitor.nextDouble();

        Double valorDeTaxa =
                exemploMetodo.calcularTaxaVenda(valorVendaDigitado);

        System.out.println("Taxa: " +  valorDeTaxa);
    }
}
