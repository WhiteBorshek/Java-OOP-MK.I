package JavaTop;

/* Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории) и включить в список продуктов в вендинг машину.
Продемонстрировать работу класса по продаже товаров 
*/

public class Product {
    private String name;
    private int calories;

    public Product(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}




