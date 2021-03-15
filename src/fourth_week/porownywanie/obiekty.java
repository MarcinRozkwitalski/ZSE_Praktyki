package fourth_week.porownywanie;

public class obiekty {

    public static void main(String[] args) {
        class Product {
            private String name;
            private double price;

            public Product(String name, double price){
                this.name = name;
                this.price = price;
            }

        }

        Product prod1 = new Product("Czekolada", 2.99);
        Product prod2 = new Product("Czekolada", 2.99);

        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.hashCode());
        System.out.println(prod2.hashCode());

    }




}
