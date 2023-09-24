package com.cts.assignment.assignment.cli;

import com.cts.assignment.assignment.entities.Product;
import com.cts.assignment.assignment.services.CartService;
import com.cts.assignment.assignment.services.OrderService;
import com.cts.assignment.assignment.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Scanner;

public class CliApp {
    @Autowired
    private ProductService productService;
    @Autowired
    private CartService cartService;
    @Autowired
    private OrderService orderService;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. List all products");
            System.out.println("2. Add a product to the cart");
            // ... Other options ...
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    List<Product> products = productService.listAllProducts();
                    // Display products ...
                    break;
                case 2:
                    // Add product logic ...
                    break;
                // ... Other cases ...
            }
        }
    }
}