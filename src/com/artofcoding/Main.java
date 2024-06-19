package src.com.artofcoding;

import src.com.artofcoding.factory.ProductsController;

public class Main {

    public static void main(String[] args) {
        System.out.println("src.com.artofcoding.Main");
        new ProductsController().listProducts();
    }
}
