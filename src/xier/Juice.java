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
		return "��������"+this.name+"\n�ɱ���"+this.cost+"\n��������Ϊ"+productDate.toString()+"\n������Ϊ"+this.lifeTime;
	}
	
	public int getLifeTime() {
		return lifeTime;
	}
	
}
