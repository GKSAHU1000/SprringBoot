# SprringBoot

* Spring boot data JPA Assignment
  Scenario
  Ozvitha Fernz Supermarket is maintaining their customer order details online as follows.
1. One customer can place more than one order
2. One order can contains more than 1 items
3. One Item can be part of many orders
4. Only registered customers can order Items
5. If one order is taken from a customer, same order id should not use for other customer
6. Billing should be calculated for a customer by order wise.
7. Customers can view their billing details for single order, or for all orders made by
   particular customer
8. Your Dao interface must extends JpaRepository
9. Create ‘@Query’ annotation atlest for one query operation
10. Create DSL (Domain specific language ) methods for custom business requirements
11. You may use any database as your choice
    Now create JPA mapping classes using spring boot data jpa for the following database for
    Ozvitha Fernz Supermarket
    Customer table
    Items Table
    Orders Table
    Order_Details table
    Customer_Orders table
    Customer_Billing
    ER – Diagram as follows (You may create your won db and tables if you wish)
    Now create Spring boot class to retrieve information from mapped classes
    and print following report for order id 10000
    Cust ID: 1000
    Cust Name: Praveen
    Order id :10000
    Order Date: 2015-04-05 19:54:11.0
--------------------------------------
ItemId ItemName Price
--------------------------------------
1 Soap 34.0
2 Book 45.0
3 Mouse 1500.0
--------------------------------------
Bill Id: 500
Cust Id: 1000
Order Id: 10000
Bill Date: 2015-04-05 20:37:41.0
Total Bill Amount: 1579.0
-------------------------------------- 