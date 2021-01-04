# Simple-Order-API

This is a simple order API written in Spring Boot with two entities namely Order and Items holding one to n relationship(One order will have n items).

#### Entities

1. Order(OrderId, CustomerId, DateOfDelivery, AddressOfDelivery, Items(ItemId list))
2. Item(ItemId, Name, Cost)

#### Controllers

1. OrderController ==> Place Order and return total cost of the order.
2. ItenController  ==> List the list of item ids available in database.
  
#### Repositories

1. OrderRestRepository ==> It is a RepositoryRestResource which facilitates CRUD operations for ORDER entity while providing RESTful services.
2. ItemRestRepository  ==> It is a RepositoryRestResource which facilitates CRUD operations for ITEM  entity while providing RESTful services.
