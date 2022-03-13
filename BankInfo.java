package week3day1.Assignments;

import org.openqa.selenium.BuildInfo;

public class BankInfo extends BuildInfo{
	
	public void deposit() {
		System.out.println("deposit");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo axis = new BankInfo();
		axis.fixed();
		axis.saving();
		axis.deposit();
	
		

	}

	protected void saving() {
		// TODO Auto-generated method stub
		
	}

	protected void fixed() {
		// TODO Auto-generated method stub
		
	}

}