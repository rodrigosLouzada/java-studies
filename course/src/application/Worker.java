package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.Departament;
import entities.HourContract;
import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<HourContract>();
	
	
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}


	public void addContract(HourContract contract) {
		
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		
		this.contracts.remove(contract);
		
	}
	
	public Double income(Integer year, Integer Mounth) {
		
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			//cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			//this.baseSalary += hourContract.getValuePorHour();
		}
	}
}
