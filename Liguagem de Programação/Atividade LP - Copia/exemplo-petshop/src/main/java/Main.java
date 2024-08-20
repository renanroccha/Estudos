public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Astolfo");
        Pet pet2 = new Pet("Pingo");

        PetShop petShop1 = new PetShop("Pet Legal", 80.0);
        PetShop petShop2 = new PetShop("Lega´s Pet", 60.0);

        petShop1.darBanho(pet1);
        petShop2.darBanho(pet1);


        System.out.println(String.format("""
                Nome: %s
                Banhos tomados: %d
                Valor gasto em pet shop: R$ %.2f 
                """, pet1.getNome(), pet1.getQtdBanhosTomados(), pet1.getValorGastoEmPetShops()));
    }
}

// pode criar um metodo para exibir os valores

// .toString() -
// conceitos de sobrecarga