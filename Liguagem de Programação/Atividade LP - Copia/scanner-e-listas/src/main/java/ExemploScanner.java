import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        // Criar objeto tipo scanner
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        // Int
        System.out.println("Digite um número inteiro:");
        Integer numero = leitor.nextInt();
        System.out.println(String.format("O número digitado foi %d", numero));

        // Double
        System.out.println("Digite um núemro real");
        Double numeroReal = leitor.nextDouble();
        System.out.println(String.format("O número real digital foi %.2f", numeroReal));


        // String
        System.out.println("Digite seu nome:");
        String nome = leitorTexto.nextLine();
        System.out.println(String.format("O nome digitado foi %s", nome));
                // nextLine utiliza separador de espaço
                // next só lê o primeiro nome
    }
}
