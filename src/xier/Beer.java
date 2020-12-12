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
		return "��������"+this.name+"\n�ɱ���"+this.cost+"\n��������Ϊ"+productDate.toString()+"\n������Ϊ"+Beer.lifeTime
				+ "\n�ƾ�����Ϊ"+this.alcoholLevel;
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
