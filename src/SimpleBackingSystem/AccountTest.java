package SimpleBackingSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {


	Account myAccount1 = new Account("Carlos Meruvia", "147342526262", 3500);
	Account myAccount2 = new Account("Marc Valentines", "385472364829", 1500);
	
	
	@Test
	void testDepositAmount() {
		
		try {
	    	 System.out.println("Ingrés al compte");
	    	 myAccount1.depositAmount(1695);
	    	 myAccount2.depositAmount(1695);
	    } catch(Exception e){
	    	 System.err.println(e.getMessage());
	         System.out.println("Error en l'ingrés");
	    }
		
		assertEquals(4500, myAccount1.getBalance());
		assertEquals(7500, myAccount1.getBalance());
		
		System.out.println("El saldo actual es " + myAccount1.getBalance()); 
		System.out.println("El saldo actual es " + myAccount2.getBalance()); 
	     
		

	}

	@Test
	void testWithdrawAmount() {
		
		try {
	    	myAccount1.withdrawAmount(2300);
	    	myAccount2.withdrawAmount(2300);
	    } catch(Exception e){
        	System.err.println(e.getMessage());
            System.out.println("Error al retirar");
	    }
		
		assertEquals(4500, myAccount1.getBalance());
		assertEquals(7500, myAccount1.getBalance());
		

	}

}
