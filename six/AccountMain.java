package session.com.six;

public class AccountMain {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.setBname("sbi");
		ac.setAcHolderName("Abid");
		ac.setAcNo(1217012);
		System.out.println(ac.getBname());
		System.out.println(ac.getAcHolderName());
		System.out.println(ac.getAcNo());
		

	}

}
