package com.cts.assignment.assignment.cli;

import com.cts.assignment.assignment.entities.Cart;
import com.cts.assignment.assignment.entities.Order;
import com.cts.assignment.assignment.entities.Product;
import com.cts.assignment.assignment.services.CartService;
import com.cts.assignment.assignment.services.OrderService;
import com.cts.assignment.assignment.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;


@Component
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
            System.out.println("1. Add a Product");
            System.out.println("2. List all products");
            System.out.println("3. Add a product to the cart");
            System.out.println("4. View cart");
            System.out.println("5. Place an order");
            System.out.println("6. View order history");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Add a Product
                    Product product = productService.addProduct(new Product("Iphone 13", "Apple", 15000.00, 10));
                    if (product.getId() != null) {
                        System.out.println("Product added Successfully");
                    }
                    break;
                case 2:
                    //List all products"
                    List<Product> products = productService.listAllProducts();
                    System.out.println(products);
                    break;
                case 3:
                    //Add a product to the cart
                    List<Product> products2 = productService.listAllProducts().stream().limit(2).toList();
                    Cart cart = cartService.addToCart(products2);
                    if (cart.getId() != null) {
                        System.out.println("Product added in Cart Successfully");
                    }
                    break;

                case 4:
                    //Print Cart
                    List<Cart> carts1 = cartService.getCart();
                    System.out.println(carts1);
                    break;

                case 5:
                    //Place an order
                    long cartId2 = 4;
                    Optional<Cart> cart2 = cartService.getCartById(cartId2);
                    if (cart2.isPresent()) {
                        Order order = orderService.placeOrder(cart2.get());
                        System.out.println(order);
                    } else {
                        System.out.println("Cart Id Not Present");
                    }

                    break;

                case 6:
                    //View order history
                    List<Order> orders = orderService.getAllOrders();
                    System.out.println(orders);
                    break;

                case 7:
                    System.exit(1);
                    break;
            }
        }
    }
}