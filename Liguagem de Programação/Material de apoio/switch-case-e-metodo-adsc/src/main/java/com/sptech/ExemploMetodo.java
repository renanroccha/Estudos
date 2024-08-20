package com.sptech;

import java.util.ArrayList;
import java.util.List;


public class ExemploMetodo {
    public static void main(String[] args) {
        Utilitaria util = new Utilitaria();

        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Melancia");
        frutas.add("Uva");

        List<String> nomes = new ArrayList<>();
        nomes.add("Giuliana");
        nomes.add("Manoel");
        nomes.add("William");
        nomes.add("Diego");

        /*
            Codigo refatorado utilizando metodos para reduzir a repetição de codigo e facilitar a manutenção do projeto
         */
        util.exibirLista(frutas);
        String frutaPesquisa = "Maçã";
        Boolean existeNaLista = util.encontrarValorNaLista(frutas, frutaPesquisa);

        String textoResposta;
        if (existeNaLista){
            textoResposta = "existe";
        } else {
            textoResposta = "não existe";
        }
        System.out.println("A fruta %s %s na lista"
                .formatted(frutaPesquisa, textoResposta));

        util.exibirLista(nomes);
        String nomePesquisa = "Pedro";
        Boolean existeNomeNaLista = util.encontrarValorNaLista(nomes, nomePesquisa);

        String textoRespostaNome;
        if (existeNomeNaLista){
            textoRespostaNome = "existe";
        } else {
            textoRespostaNome = "não existe";
        }
        System.out.println("O nome %s %s na lista"
                .formatted(nomePesquisa, textoRespostaNome));
    }
}
