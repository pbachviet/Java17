package Hw9.database;

import Hw9.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDatabase {
    public static List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "áo phông", 6, 110.00),
            new Product(2, "quần dài", 3, 89.99),
            new Product(3, "tất", 8, 15.30),
            new Product(4, "khăn", 9, 60.00),
            new Product(5, "găng tay", 9, 30.00),
            new Product(6, "áo khoác", 10, 150.00),
            new Product(7, "quần đùi", 3, 70.50),
            new Product(8, "mũ", 4, 40.00)
    ));

}
