package com.sptech;

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
                    0 - Sair""");
            opcao = input.nextInt();

            /*
                O switch case é uma estrutura de controle que avalia uma expressão e, com base no valor resultante,
               determina qual bloco de código case deve ser executado. Após a execução desse bloco, é comum usar a
               palavra-chave break para sair do switch. Se o case não contiver um break, a execução continuará para o
               próximo case, a menos que haja uma instrução break ou até o final do switch ser alcançado.
             */
            switch (opcao) {
                case 1:
                    System.out.println("Zzzzzz...");
                    break;
                case 2:
                    System.out.println("Segunda, dia incrivel");
                    break;
                case 3:
                    System.out.println("Na terça tenho fut");
                    break;
                case 4:
                    System.out.println("Pelo amor de deu chega logo sexta");
                    break;
                case 5:
                    System.out.println("Hoje tem LP, adoro essa aula");
                    break;
                case 6:
                    System.out.println("Sextou");
                    break;
                case 7:
                    System.out.println("Dia de tomar banho");
                    break;
                case 0:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        /*
            Switch case melhorado:
         */
        switch (opcao) {
            case 1 -> System.out.println("Zzzzzz...");
            case 2 -> System.out.println("Segunda, dia incrivel");
            case 3 -> System.out.println("Na terça tenho fut");
            case 4 -> System.out.println("Pelo amor de deu chega logo sexta");
            case 5 -> System.out.println("Hoje tem LP, adoro essa aula");
            case 6 -> System.out.println("Sextou");
            case 7 -> System.out.println("Dia de tomar banho");
            case 0 -> {
                System.out.println("Adeus");
                System.out.println("Até a proxima");
            }
            default -> System.out.println("Opção inválida");
        }

        /*
            O switch case é case sensitive com o uso de string.
         */
        System.out.println("Exibindo frase cargo");
        String cargo = "chefe";
        switch (cargo) {
            case "chefe":
                System.out.println("Você é o chefe");
                break;
            default:
                System.out.println("Não encontrei o cargo");
                break;
        }
    }
}
