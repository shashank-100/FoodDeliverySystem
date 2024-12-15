The goal of this project is to build a food delivery application (similar to Zomato or Swiggy) using three microservices. These services communicate via RESTful APIs, and each service handles different tasks:

Overview of the Services:
Restaurant Service: Manages restaurant item inventories.
Delivery Service: Manages customer orders, assigns delivery agents, and tracks the order status.
Wallet Service: Manages customer balances and payments.
Features:
The system starts with pre-defined data such as customers, restaurants, items, and delivery agents, stored in a file called /initialData.txt.
Customers place orders through the Delivery Service, which communicates with both Restaurant and Wallet services.
Service Endpoints:
Restaurant Service:
POST /acceptOrder: Accepts an order if there’s enough inventory of the item. Reduces the inventory of the item when the order is accepted.
POST /refillItem: Refills the inventory of an item when needed.
POST /reInitialize: Resets all restaurant inventories to the initial values.
Delivery Service:
POST /requestOrder: Handles order placement, calculates the total cost, checks if the customer has enough funds, and updates the order status.
POST /agentSignIn: Allows delivery agents to sign in. It assigns them to an unassigned order if available.
POST /agentSignOut: Allows delivery agents to sign out.
POST /orderDelivered: Marks an order as delivered and updates the agent's status.
GET /order/num: Retrieves the status of a specific order (unassigned, assigned, or delivered).
GET /agent/num: Retrieves the status of a specific delivery agent (signed-out, available, or unavailable).
POST /reInitialize: Resets all orders and marks all agents as signed-out.
Wallet Service:
POST /addBalance: Increases a customer’s balance.
POST /deductBalance: Deducts an amount from the customer’s balance if they have enough funds.
GET /balance/num: Retrieves the balance of a specific customer.
POST /reInitialize: Resets all customers’ balances to the initial values.
