package observer_pattern_self;

/**
 * �۲���ģʽ�������˶���֮��һ�Զ������������һ������һ������ı�ʱ���������������߶����յ�֪ͨ������
 * ���磺Android�е����ü���addOnClickListener();
 * @author ��С��
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
