package xier;

import java.util.ArrayList;

public class West2FriedChickenRestauran implements FriedChickenRestaurant{

	double vacancy;
	ArrayList<Beer> beerList;
	ArrayList<Juice> juiceList;
	ArrayList<SetMeal> setMealList;
	
	static {
		
	}
	
	private void use(Beer beer) {
		if(beerList.contains(beer)) {
			beerList.remove(beer);
		}else {
			throw new IngredientSortOutException("这款啤酒卖完啦！");
		}
		
	}
	private void use(Juice juice) {
		if(juiceList.contains(juice)) {
			juiceList.remove(juice);
		}else {
			throw new IngredientSortOutException("这款果汁卖完啦！");
		}
	}
	
	@Override
	public void sellSetMeal(SetMeal setMeal) {
		if(setMeal.drink instanceof Beer) {
			Beer beer = (Beer) setMeal.drink;
			use(beer);
		}
		if(setMeal.drink instanceof Juice) {
			Juice juice = (Juice) setMeal.drink;
			use(juice);
		}
		vacancy+=setMeal.price;
	}

	@Override
	public void bulkPurchase(Drinks drinks) {
		if(vacancy<drinks.cost) {
			throw new OverdraftBalanceException("余额不足！还需"+(drinks.cost-vacancy)+"元");
		}else {
			vacancy-=drinks.cost;
			System.out.print("进货成功！当前余额"+vacancy+"元");
		}
	}

}
