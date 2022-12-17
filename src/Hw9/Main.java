package Hw9;

import Hw9.controller.ProductController;
import Hw9.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.run();
    }
}
