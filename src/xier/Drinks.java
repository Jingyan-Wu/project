package xier;

import java.time.LocalDate;
import java.util.Date;

public abstract class Drinks {

	protected String name;
	protected double cost;
	protected LocalDate productDate;
	protected int lifeTime ; 
	
	public Drinks() {
		
	}
	public Drinks(String name,double cost,LocalDate productDate ) {
		this.name = name;
		this.cost = cost;
		this.productDate = productDate;
	}
	
	public abstract void isOutOfDate(Date today);
	public abstract String toString() ;
	
}
