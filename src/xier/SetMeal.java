package xier;

public class SetMeal {

	String name;
	double price;
	String friedChicken;
	Drinks drink;
	
	public SetMeal(){
		
	}
	public SetMeal(String name,double price,String friedChicken,Drinks drink) {
		this.name = name;
		this.price = price;
		this.friedChicken = friedChicken;
		this.drink = drink;
	}
	@Override
	public String toString() {
		return "���ײ���"+this.name+"\n�۸���"+this.price+"\nը����"+friedChicken+"\n������"+this.drink.toString();
	
	}
}
