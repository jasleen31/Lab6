package com.r094.q3;

public class SalariedWorker extends DailyWorker{

	SalariedWorker(String name, float salaryRate) {
		super(name, salaryRate);
		
	}
	public static void main(String args[]) {
		//ComPay is overloaded, hance can calculate wage for both type of workers.
				SalariedWorker sw = new SalariedWorker("Alex",12000.0f);
				sw.wage = sw.ComPay();
				sw.aboutAndPay();
				
				DailyWorker dw = new DailyWorker("Mark", 10000.5f);
				dw.wage = dw.ComPay(35);
				dw.aboutAndPay();
	}

}
