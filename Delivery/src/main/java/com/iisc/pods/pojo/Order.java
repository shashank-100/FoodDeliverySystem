package com.iisc.pods.pojo;

/**
 * 
 * @author ankit
 * A Java class that corresponds to orders placed. Each order has following information :
 * 1. custId  : An customer ID assigned to every agent
 * 2. restId  : Restaurant id
 * 3. itemId  : Item id which customer ordered
 * 4. qty     : Quantity ordered by customer
 * 5. orderId : Order Id assigned to this order
 * 6. status  : Status of Order
 * 7. agentId : Agent which is assigned to deliver the order
 */
public class Order {
	
	int custId;
	int restId;
	int itemId;
	int qty;
	int orderId;
	String status;
	int agentId;
	
	public Order(){
		orderId = -1;
		status = null;
		agentId = -1;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	@Override
	public String toString() {
		return "Order [custId=" + custId + ", restId=" + restId + ", itemId=" + itemId + ", qty=" + qty + "]";
	}
	
	
}
