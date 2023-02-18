package head_first_design_pattern.demo.section02_observer_pattern.observer_class;

import head_first_design_pattern.demo.section02_observer_pattern.observer_interface.DisplayElement;
import head_first_design_pattern.demo.section02_observer_pattern.observer_interface.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
//    public void update(float temperature, float humidity, float pressure) {
    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature
            + "F, 습도 " + humidity + "%");
    }
}
