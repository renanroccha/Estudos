public class ExemploInterpolacao {
    public static void main(String[] args) {
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.60;

        // Para usar Interpolação:
        // Para String: %s
        // Para Inteiros: %d
        // Para Double: %.2f (sendo 2 o número de casas decimais, pode usar 1, 2 ,3...)
        String fraseFormatada =
                String.format("""
                                Meu nome é: %s
                                Minha idade é: %d
                                Minha altura é: %.2f
                                Nome do meu pet: %s
                                """,
                        nome, idade, altura, "Caramelo");

        String fraseFormatadaSegundaOpcao = """
                                Meu nome é: %s
                                Minha idade é: %d
                                Minha altura é: %.2f
                                Nome do meu pet: %s
                """.formatted(nome, idade, altura, "Caramelo");


        Boolean petVacinado = false;

        System.out.println("""
                                Meu nome é: %s
                                Minha idade é: %d
                                Minha altura é: %.2f
                                Nome do meu pet: %s
                                Pet vacinado: %s
                """.formatted(nome, idade, altura, "Caramelo", (petVacinado ? "Sim" : "Não") ));


        //Exemplo if/operador ternário
        // Se a idade for menor que 15 anos, o salário será de 800 reais, se for maior que 15 anos, será 1500
        Integer idadeParaReceberSalario = 15;
        Double salarioReceber = idadeParaReceberSalario < 15 ? 800.0 : 1500.0;
        Boolean maiorDeIdade = idade > 18;

        //Cuidado com nome de boleanos!
        Boolean bloqueadoOuNao = false;

        if (!bloqueadoOuNao){
            System.out.println("Ta bloqueado!");
        }
    }
}
