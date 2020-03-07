package MeritAmericaBankApp;

public class MeritAmericaBankApp {

	public static void main(String[] args) {
		
		
		AccountHolder abraham = new AccountHolder("abraham"," ","moreno","123456",100,1000);  //i
		//System.out.println(abraham);														  //ii
		
		CheckingAccount c = abraham.getCheckingAccount();									  //iii
		c.deposit(500);
		//System.out.println(abraham);
		
		SavingsAccount s = abraham.getsavings();											  //iv
		s.withdraw(800);
		System.out.println(CheckingAccount);

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*fv = finalValue, i = interest, n=number of years, pv = present value
		double pv = 100;
		double i = 0.0001;
		double n = 3;
		double fv = (i*n*pv+pv);
		System.out.println(fv);
		*/
	}

}

