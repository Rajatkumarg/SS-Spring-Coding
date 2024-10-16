package com.rajat.beans4;

import java.util.Arrays;
import java.util.List;

public class Company {
	private String compName;
	private Employee[] workers;
	private List<Employee> workerList;

	public List<Employee> getWorkerList() {
		return workerList;
	}

	public void setWorkerList(List<Employee> workerList) {
		this.workerList = workerList;
	}

	public Company() {
		System.out.println("Creating Company object...");
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Employee[] getWorkers() {
		return workers;
	}

	public void setWorkers(Employee[] workers) {
		this.workers = workers;
	}

	@Override
	public String toString() {
		return "Company [compName=" + compName + ", workers=" + Arrays.toString(workers) + ", workerList=" + workerList
				+ "]";
	}

}
