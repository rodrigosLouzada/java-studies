package entities;

import java.time.LocalDate;

public class HourContract {

	private LocalDate date;
	private Double valuePorHour;
	private Integer hours;
	
	public HourContract(LocalDate date, Double valuePorHour, Integer hours) {
		this.date = date;
		this.valuePorHour = valuePorHour;
		this.hours = hours;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getValuePorHour() {
		return valuePorHour;
	}
	public void setValuePorHour(Double valuePorHour) {
		this.valuePorHour = valuePorHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
	
	
}
