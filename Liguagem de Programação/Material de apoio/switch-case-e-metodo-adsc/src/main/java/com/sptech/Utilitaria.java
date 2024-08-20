package com.sptech;

import java.util.List;

public class Utilitaria {

    /*
        Método sem retorno que recebe um lista de String e exibe todos os valores na lista
     */
    void exibirLista(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    /*
        Metodo com retorno do tipo boleano que recebe uma lista de String e uma String para pesquisa.
       O método percorre a lista e compara se a pesquisa existe dentro da lista,
       o metodo retorna true se o valor existir e false caso o valor não existe
     */
    Boolean encontrarValorNaLista(List<String> lista, String pesquisa) {
        Boolean existeNaLista = false;
        for (int i = 0; i < lista.size(); i++) {
            if (pesquisa.equalsIgnoreCase(lista.get(i))) {
                existeNaLista = true;
            }
        }

        return existeNaLista;
    }
}
