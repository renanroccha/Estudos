package Exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList();
        frutas.add("Banana");
        frutas.add("Melancia");
        frutas.add("Uva");

        List<String> nomes = new ArrayList();
        nomes.add("Giuliana");
        nomes.add("Manoel");
        nomes.add("William");
        nomes.add("Diego");

        String frutaPesquisa = "Maçã";
        util.exibirLista(frutas);

        String texto


        Boolean encontrado(List<String> lista, String pesquisa){
            Boolean existeNaLista = false;
            for (int i = 0; i < lista.size(); i++){
                if (pesquisa.esqualsIgnoreCase(lista.get(i))) {
                    existeNaLista = true;
                }
            }
            return existeNaLista;
        }


        }
        }





