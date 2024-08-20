package Exemplos;

import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer opcao;
        do {


            System.out.println("""
                    Escolha um dia da semana:
                    1 - Domingo
                    2 - Segunda
                    3 - Terça
                    4 - Quarta
                    5 - Quinta
                    6 - Sexta
                    7 - Sábado
                    """);

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("ZZZZZZZ....");
                    break;
                case 2:
                    System.out.println("Trabaiar");
                    break;
                case 3:
                    System.out.println("Trabaiar e mimir");
                    break;
                case 4:
                    System.out.println("Trabaiar e Estudar");
                    break;
                case 5:
                    System.out.println("Trabaiar, Estudar e Grupo");
                    break;
                case 6:
                    System.out.println("Trabaiar, Estudar e mimir");
                    break;
                case 7:
                    System.out.println("Farra");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }
        while (opcao != 0);

        String cargo = "Chefe";
        switch (cargo.toLowerCase()) {
            case "chefe":
                System.out.println("Você é o chefe");
                break;
            default:
                System.out.println("Não encontrei o cargo");
                break;
        }
    }
}