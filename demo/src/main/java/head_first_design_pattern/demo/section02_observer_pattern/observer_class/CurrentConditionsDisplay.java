package head_first_design_pattern.demo.section02_observer_pattern.observer_class;

import head_first_design_pattern.demo.section02_observer_pattern.observer_interface.DisplayElement;
import head_first_design_pattern.demo.section02_observer_pattern.observer_interface.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {

    }
}
