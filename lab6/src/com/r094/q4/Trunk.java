package com.r094.q4;

public class Trunk {
	// Class field
		Float ordinary, urgent; // 1: Ordinary, 2: Urgent
		
		Trunk(){
			this.ordinary = 1.0f;
			this.urgent = 1.5f;
		}
		
		private Float genBill(int type, float duration) {
			return ordinary*duration;
		}
		
		private Float genBill(int type, double duration) {
			return urgent*(float)duration;
		}
		
		public static void main(String[] args) {
			Trunk ordCall = new Trunk(); 
			Trunk urgCall = new Trunk();
			
			System.out.println("Ordinary Call Bill -> "+ ordCall.genBill(1, 20.0f));
			System.out.println("Urgent Call Bill -> "+ urgCall.genBill(1, 20.0));
		}

}
