package observer_pattern_self;

/**
 * 观察者模式：定义了对象之间一对多的依赖，这样一来，当一个对象改变时，它的所有依赖者都会收到通知并更新
 * 例如：Android中的设置监听addOnClickListener();
 * @author 杨小过
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay();
		conditionsDisplay.addSubject(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
