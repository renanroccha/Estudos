import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// LISTAS
public class ExemploLista {
    public static void main(String[] args) {

        // <>
//        List listaMaluca = new ArrayList();
//        listaMaluca.add("Maria Eduarda");
//        listaMaluca.add(8);
//        listaMaluca.add(true);
//        listaMaluca.add(1.60);
//
//        System.out.println(listaMaluca);
//
//        // adicionar na posição desejada
//        listaMaluca.add(0,"Eduarda");
//        System.out.println(listaMaluca);
//
//        // substituir na litsa
//        listaMaluca.set(1, "Duda");
//        System.out.println(listaMaluca);
//        listaMaluca.set(0, "Maria Eduarda");
//       System.out.println(listaMaluca);
//
//        // remove pelo objeto
//        // remove pela posicão (i)
//        Integer valor = 8;
//        listaMaluca.remove(3);
//       System.out.println(listaMaluca);
//
//        // PEGAR UM VALOR DENTRO DA LISTA
//        System.out.println(listaMaluca.get(0));
//        System.out.println(listaMaluca);

        // LISTA TIPADA
        List <Integer> listaNumeros = new ArrayList();
        listaNumeros.add(5);
        listaNumeros.add(10);
        listaNumeros.add(15);
        listaNumeros.add(20);
        listaNumeros.add(25);

        System.out.println(listaNumeros);

        // PEGAR TAMANHO DA LISTA
        System.out.println(listaNumeros.size());

        for(int i=0; i<listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));
        }

        // USUARIO DIGITAR VALORES DA LISTA
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos valores deseja digitar:");
        Integer qtdValores = leitor.nextInt();
        for(int i=0; i<qtdValores; i++){
            System.out.println(String.format("Informe o %d valor", i + 1));
            Integer valorDigitado = leitor.nextInt();
            listaNumeros.add(valorDigitado);

        }
        System.out.println(listaNumeros);
    }
}
