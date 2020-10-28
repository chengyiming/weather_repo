package weathermachine;


/**
 * @author: cym
 */
public class WateringMachine extends AbstractMachine {

    private boolean status;

    public WateringMachine(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.attach(this);
    }

    public boolean getStatus()
    {
        return status;
    }

    @Override
    public void start(Weather weather)
    {
        status = satisfy(weather);
    }

    public boolean satisfy(Weather weather) {
        return weather.temp > WATERING_MACHINE_TEMP &&
                weather.humidity < WATERING_MACHINE_HUMIDITY &&
                weather.windPower < WATERING_MACHINE_WINDPOWER;
    }
}
