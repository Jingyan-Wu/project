package xier;

public class OverdraftBalanceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OverdraftBalanceException() {
		super();
	}
	public OverdraftBalanceException(String message) {
		super(message);	
	}
}
