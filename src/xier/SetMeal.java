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
		return "该套餐是"+this.name+"\n价格是"+this.price+"\n炸鸡是"+friedChicken+"\n饮料是"+this.drink.toString();
	
	}
}
