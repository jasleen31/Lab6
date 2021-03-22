package com.r094.q3;

public class DailyWorker extends Worker{
	protected float wage;

	DailyWorker(String name, float salaryRate) {
		super(name, salaryRate);
		wage = 0.0f;
	}
	protected void aboutAndPay() {
		this.workerData();
		System.out.println("My Wage -> Rs."+ this.wage+ "/-");
	}
	

}
