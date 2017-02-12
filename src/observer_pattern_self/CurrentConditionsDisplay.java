package observer_pattern_self;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	
	public void addSubject(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+
				"F degree and"+humidity+"%humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity=humidity;
		this.temperature=temp;
		display();
	}

}
