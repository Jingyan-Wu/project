package xier;

import java.time.LocalDate;
import java.util.Date;

public abstract class Beer extends Drinks{

	private float alcoholLevel;
	final static int lifeTime = 30;

	public Beer() {
	}
	public Beer(String name,double cost,LocalDate productDate,float alcoholLevel) {
		super(name,cost,productDate);
		this.setAlcoholLevel(alcoholLevel);
	}
	
	@Override
	public void isOutOfDate(Date today) {
		
	}

	@Override
	public String toString() {
		return "该饮料是"+this.name+"\n成本是"+this.cost+"\n生产日期为"+productDate.toString()+"\n保质期为"+Beer.lifeTime
				+ "\n酒精度数为"+this.alcoholLevel;
	}
	
	public float getAlcoholLevel() {
		return alcoholLevel;
	}
	public void setAlcoholLevel(float alcoholLevel) {
		this.alcoholLevel = alcoholLevel;
	}
	public int getLifeTime() {
		return lifeTime;
	}
	
	
}
