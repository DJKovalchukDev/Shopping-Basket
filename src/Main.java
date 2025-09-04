public class Main {
    public static void main(String[] args) {
        Basket vasiaBasket = new Basket();
        vasiaBasket.add("Апельсины / Oranges", 100);
        vasiaBasket.add("Бананы / Bananas", 90);


        Basket petiaBasket = new Basket(100);
        petiaBasket.add("Гвозди / Nails", 50);
        petiaBasket.add("Молоток / Hammer", 200);

        Basket mashaBasket = new Basket("Стол / Table", 5000);
        mashaBasket.add("Стул / Chair", 1000);


        vasiaBasket.print("\nКорзина Васи / Vasia’s basket: ");
        petiaBasket.print("\nКорзина Пети / Petia’s basket: ");
        mashaBasket.print("\nКорзина Маши / Masha’s basket: ");
    }
}
