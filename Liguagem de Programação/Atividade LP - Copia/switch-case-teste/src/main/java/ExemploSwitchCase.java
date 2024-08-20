import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {

        // AULA SWITCH CASE

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana:");
        Integer diaDaSemana = leitor.nextInt();


        switch (diaDaSemana){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sextou");
                break;
            default:
                System.out.println("Número inválido");
        }

        // SWITCH CASE COM STRING

        String fruta = "Melancia";
        switch (fruta){
            case "Maçã":
                System.out.println("Temos maçãs no estoque");
                break;
            case "Melancia":
                System.out.println("Temos melancia no estoque");
                break;
            case "Kiwi":
                System.out.println("Não é época de Kiwi, não temos");
                break;
            default:
                System.out.println("Fruta não identificada");
        }


    }
}
