package weathermachine;


/**
 * @author: cym
 */
public class SeedingMachine extends AbstractMachine {

    private boolean status;

    public SeedingMachine(WeatherData weatherData) {
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
        return weather.temp > SEEDING_MACHINE_TEMP;
    }
}
