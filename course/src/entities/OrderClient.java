package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderClient {
	
	private LocalDateTime momenTime;
	private List<OrderStatus> orderStatus = new ArrayList<OrderStatus>();
	
	public OrderClient(LocalDateTime momenTime, List<OrderStatus> orderStatus) {
		this.momenTime = momenTime;
		this.orderStatus = orderStatus;
	}

	public LocalDateTime getMomenTime() {
		return momenTime;
	}

	public void setMomenTime(LocalDateTime momenTime) {
		this.momenTime = momenTime;
	}

	public List<OrderStatus> getOrderStatus() {
		return orderStatus;
	}

	public void addItem(OrderItem orderItem) {
		             
		
	}
	
	
	
}
