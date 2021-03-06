package factory_pattern;
/*
 * 所有工厂模式都用来封装对象的创建。工厂方法模式（Factory Method Pattern）
 * 通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的，
 * 
 * 工厂方法模式:定义了一个创建对象的借口，但由子类决定要实例化的类是哪一个，工厂方法
 * 让类把实例化推迟到子类
 */
public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore=new NYPizzaStore();
		Pizza pizza=nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName());
	}

}
