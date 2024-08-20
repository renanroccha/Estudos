import java.util.Scanner;

public class DesafioScanner {
    public static void main(String[] args) {

        Scanner dadosPet = new Scanner(System.in);

        System.out.println("REGISTROS DOS PETS");
        System.out.println("Insira o nome do seu pet:");
        String nome = dadosPet.nextLine();


        System.out.println("Insira a idade do seu pet:");
        Integer idade = dadosPet.nextInt();

        System.out.println("Insira a altura do seu pet:");
        Double altura = dadosPet.nextDouble();


        System.out.println(String.format("""
               --------------------------
                Ficha do Pet
               --------------------------
                Nome: %s
                Idade: %d
                Altura: %.2f
               -------------------------
                """,nome, idade, altura));

    }
}
