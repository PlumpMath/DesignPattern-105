package strategy_pattern;

/**
 * 策略模式测试类：定义了算法族，分别封装起来，让他们之间合一相互替换，
 * 此模式让算法的变化，独立于使用算法的客户。
 * 	常见的如：Android中recyclerView中的设置间隔。
 * @author 杨小过
 *
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.performFly();
		mallard.performQuauk();
		
		Duck model=new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
