package weathermachine;


/**
 * @author: cym
 */
public class ReapingMachine extends AbstractMachine{

    private boolean status;

    public ReapingMachine(WeatherData weatherData) {
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
        return weather.temp > REAPING_MACHINE_TEMP &&
                weather.humidity > REAPING_MACHINE_HUMIDITY;
    }
}
