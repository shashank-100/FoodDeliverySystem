<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>
    <h1>Food Delivery Application</h1>
    <p>The goal of this project is to build a food delivery application (similar to Zomato or Swiggy) using three microservices. These services communicate via RESTful APIs, and each service handles different tasks:</p>
    <h2>Overview of the Services:</h2>
    <ul>
        <li><b>Restaurant Service</b>: Manages restaurant item inventories.</li>
        <li><b>Delivery Service</b>: Manages customer orders, assigns delivery agents, and tracks the order status.</li>
        <li><b>Wallet Service</b>: Manages customer balances and payments.</li>
    </ul>
    <h2>Features:</h2>
    <p>The system starts with pre-defined data such as customers, restaurants, items, and delivery agents, stored in a file called /initialData.txt. Customers place orders through the Delivery Service, which communicates with both Restaurant and Wallet services.</p>
    <h2>Service Endpoints:</h2>
    <h3>Restaurant Service:</h3>
    <ul>
        <li><b>POST /acceptOrder</b>: Accepts an order if there’s enough inventory of the item. Reduces the inventory of the item when the order is accepted.</li>
        <li><b>POST /refillItem</b>: Refills the inventory of an item when needed.</li>
        <li><b>POST /reInitialize</b>: Resets all restaurant inventories to the initial values.</li>
    </ul>
    <h3>Delivery Service:</h3>
    <ul>
        <li><b>POST /requestOrder</b>: Handles order placement, calculates the total cost, checks if the customer has enough funds, and updates the order status.</li>
        <li><b>POST /agentSignIn</b>: Allows delivery agents to sign in. It assigns them to an unassigned order if available.</li>
        <li><b>POST /agentSignOut</b>: Allows delivery agents to sign out.</li>
        <li><b>POST /orderDelivered</b>: Marks an order as delivered and updates the agent's status.</li>
        <li><b>GET /order/num</b>: Retrieves the status of a specific order (unassigned, assigned, or delivered).</li>
        <li><b>GET /agent/num</b>: Retrieves the status of a specific delivery agent (signed-out, available, or unavailable).</li>
        <li><b>POST /reInitialize</b>: Resets all orders and marks all agents as signed-out.</li>
    </ul>
    <h3>Wallet Service:</h3>
    <ul>
        <li><b>POST /addBalance</b>: Increases a customer’s balance.</li>
        <li><b>POST /deductBalance</b>: Deducts an amount from the customer’s balance if they have enough funds.</li>
        <li><b>GET /balance/num</b>: Retrieves the balance of a specific customer.</li>
        <li><b>POST /reInitialize</b>: Resets all customers’ balances to the initial values.</li>
    </ul>
</body>
</html>

