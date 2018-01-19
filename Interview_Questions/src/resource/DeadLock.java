package resource;
/**
 * 
 * Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. 
 * Deadlocks can occur in Java when the synchronized keyword causes the executing thread to block while waiting to get the lock, 
 * associated with the specified object.
 *
 */
class Account {
    
    private int balance;

    public Account(int balance) {	
	this.balance = balance;
    }    
    
    public int getBalance() {
        return balance;
    }
    
    public synchronized void deposit(int money) {
	
	this.balance += money;
	withdraw(400);
    }
    
    public synchronized void withdraw(int money) {
	
	this.balance -= money;
	deposit(100);
	
    }    
}


public class DeadLock { 
   
    public static void main(String[] args) throws InterruptedException {	
	
	Account a = new Account(500);	
	
	Thread t1 = new Thread(new Runnable() {	      
	    
	    @Override
	    public void run() {		
		
		a.deposit(300);
		
	    }
	});
	
	Thread t2 = new Thread(new Runnable() {	      
	    
	    @Override
	    public void run() {		
		
		a.withdraw(400);			
		
	    }
	});
	
	t1.start();	
	t2.start();
	/*
	t1.join();
	t2.join();
	*/
	System.out.println(a.getBalance());
	
	
    }

}
