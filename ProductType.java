package JavaTop;


class Main {
    public static void main(String[] args) {
        Product chocolate = new Product("Шоколад", 250);
        Product soda = new Product("Газировка", 150);
        Product chips = new Product("Чипсы", 536);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(chocolate);
        vendingMachine.addProduct(soda);
        vendingMachine.addProduct(chips);

        // Продажа товаров
        vendingMachine.sellProduct("Шоколад");
        vendingMachine.sellProduct("Газировка");
        vendingMachine.sellProduct("Печенье"); // Товар не найден
        vendingMachine.sellProduct("Чипсы");
        vendingMachine.sellProduct("Багет с колбасой"); // Товар не найден

        // Демонстрация свойств продукта
        System.out.println("Название продукта: " + chocolate.getName());
        System.out.println("Калории: " + chocolate.getCalories());
        System.out.println("Название продукта: " + soda.getName());
        System.out.println("Калории: " + soda.getCalories());
        System.out.println("Название продукта: " + chips.getName());
        System.out.println("Калории: " + chips.getCalories());

    }
}
