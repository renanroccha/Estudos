import java.util.Scanner;

public class DesafioSwitchCase {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);


        Integer opcao;
        Integer num1;
        Integer num2;

        do{
            System.out.println("""
                Escolha uma opção
                1 - Somar
                2 - Subtrair
                3 - Multiplicar 
                """);
            opcao = leitor.nextInt();
        }while(opcao != 1 && opcao !=2 && opcao != 3 );

        switch (opcao){
            case 1:
                System.out.println("Digite 2 números");
                num1 = leitor.nextInt();
                num2 = leitor.nextInt();
                System.out.println(String.format("Soma: %d", num1+num2));
                break;

            case 2:
                System.out.println("Digite 2 números");
                num1 = leitor.nextInt();
                num2 = leitor.nextInt();
                System.out.println(String.format("Subtração: %d", num1-num2));
                break;

            case 3:
                System.out.println("Digite 2 números");
                num1 = leitor.nextInt();
                num2 = leitor.nextInt();
                System.out.println(String.format("Multiplicação: %d", num1*num2));
                break;
            default:
                System.out.println("Digite uma operação válida");
        }

    }
}
