# SprringBoot

* Assignment: E-Commerce CLI Application using Spring Boot, Data JPA, and MySQL

Objective: Develop a command-line e-commerce application where users can view products,
add them to a cart, and place orders through a series of text-based prompts and responses.
Requirements:
1. Setup & Configuration:
    Setup a new Spring Boot project using the Spring Initializr.
    Include the following dependencies: Spring Data JPA and MySQL Driver.
    Configure the application.properties or application.yml for the MySQL
   database connection.
2. Entities:
    Same as previously provided.
3. Repositories:
    Same as previously provided.
4. Services:
    ProductService: CRUD operations for products.
    CartService: Operations like add product to cart, remove product from cart,
   and view cart.
    OrderService: Operations like place an order and view order history.
5. CLI Interface:
    On starting the application, display a menu with options such as:
1. List all products
2. Add a product to the cart
3. View cart
4. Place an order
5. View order history
6. Exit
    Depending on the user's choice, perform the corresponding action, and then
   return to the menu.
6. Validation:
    Ensure products added to the cart or orders are available in stock.
    Prevent adding products to the cart if they are out of stock.
7. Exception Handling:
    Handle potential issues in a user-friendly way, such as product not found, out
   of stock, etc.
8. Bonus (Optional):
    Implement user authentication at the start of the application and associate
   carts and orders with specific users.
    Persist the state of the application such that carts and orders survive
   application restarts.
    Implement unit tests for the services.
   Deliverables:
    Source code of the CLI e-commerce application.
    README.md explaining how to set up, run, and interact with the application.
   Evaluation Criteria:
    Proper implementation of Spring Boot, Data JPA, and MySQL integrations.
    Code quality, organization, and readability.
    Handling edge cases and validation.
    (Optional) Extra features implemented in the bonus section.
   This revised assignment focuses on backend logic and data persistence, with interaction
   done via a text-based interface. It provides a good challenge for implementing Spring Data
   JPA functionalities without the overhead of web or REST APIs.





 