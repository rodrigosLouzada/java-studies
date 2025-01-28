package entities.enums;

public enum Order_Status {
	PEDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	Integer statusCode;
	
	private Order_Status(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
}
