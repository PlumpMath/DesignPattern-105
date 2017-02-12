package factory_pattern;

public abstract class PizzaStore {

/*	private SimplePizzaFactory mFactory;
	public PizzaStore(SimplePizzaFactory factory){
		mFactory=factory;
	}*/
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	/*
	 * 当要给分店一些自由度时，可以把创建pizza方法放到
	 * pizzaStore的对象之中。
	 */
	abstract Pizza createPizza(String type);
}
