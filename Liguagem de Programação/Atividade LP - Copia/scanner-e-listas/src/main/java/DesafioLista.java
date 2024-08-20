import java.util.ArrayList;
import java.util.List;

public class DesafioLista {
    public static void main(String[] args) {
        List <Integer> soma = new ArrayList();
        soma.add(10);
        soma.add(20);
        soma.add(30);
        soma.add(40);

        Integer resultado = 0;
        for(int i=0; i<soma.size(); i++){
           resultado += soma.get(i);
        }
        System.out.println(String.format("Soma dos valores da lista: %d", resultado ));

    }
}
