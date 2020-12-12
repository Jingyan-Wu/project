package xier;

import java.time.LocalDate;
import java.util.Date;

public class Juice extends Drinks {

	final int lifeTime = 2;

	public Juice() {
		super();
	}
	public Juice(String name,double cost,LocalDate productDate) {
		super(name,cost,productDate
				);
	}
	@Override
	public void isOutOfDate(Date today) {
		
	}

	@Override
	public String toString() {
		return "该饮料是"+this.name+"\n成本是"+this.cost+"\n生产日期为"+productDate.toString()+"\n保质期为"+this.lifeTime;
	}
	
	public int getLifeTime() {
		return lifeTime;
	}
	
}
