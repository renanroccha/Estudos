import java.util.Scanner;

public class TesteMetodo {

    public static void main(String[] args) {

        String teste;

        // é um objeto
        ExemploMetodo exemploMetodo = new ExemploMetodo();

        exemploMetodo.apresentarUsuario("Bob");

    Scanner leitor = new Scanner(System.in);
        System.out.println("Digite");
        Double valorVendaDigitado = leitor.nextDouble();

    }

    void exibirClasseSocial() {
        System.out.println("E");
    }

    String retornarClasseSocial() {
        return "E";
    }

}