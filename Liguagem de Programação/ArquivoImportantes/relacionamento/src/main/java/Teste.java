public class Teste {
    public static void main(String[] args) {


        Contato contato1 = new Contato("Maria", "(11) 123");
        Contato contato2 = new Contato("Eduarda", "(11) 321");
        Contato contato3 = new Contato("Jean chatinho", "(11) 456");


        Grupo grupo01 = new Grupo("Trabalho");
        Grupo grupo02 = new Grupo("Amigos");

        grupo01.adicionar(contato1);
        grupo01.adicionar(contato2);

        grupo02.adicionar(contato3);
        grupo02.adicionar(contato1);


//        System.out.println(grupo01);
//        System.out.println(grupo02);

        grupo01.exibirContatos();
        grupo02.exibirContatos();




    }
}
