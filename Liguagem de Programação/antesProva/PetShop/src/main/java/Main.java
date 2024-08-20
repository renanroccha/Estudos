public class Main {



    public static void main(String[] args) {


        Pet pet01 = new Pet("Nath");
        Pet pet02 = new Pet("Renan");

        PetShop petShop01 = new PetShop("PetShop Nath");
        PetShop petShop02 = new PetShop("PetShop Michelly");

          petShop01.darBanho(pet01, 40.0);


        System.out.println("""
                NomePet: %s
                Total Gasto: %.2f
                Idas ao pet: %d
                """.formatted(pet01.getNome() , pet01.getTotalGasto() , pet01.getIdasPetShop() ));


    }
}
