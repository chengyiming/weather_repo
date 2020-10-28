package weathermachine;

/**
 * @author: cym
 */
public abstract class AbstractMachine {
    public  final static int SEEDING_MACHINE_TEMP = 5;
    public  final static int REAPING_MACHINE_TEMP = 5;
    public final static int REAPING_MACHINE_HUMIDITY = 65;
    public  final static int WATERING_MACHINE_TEMP = 10;
    public final static int WATERING_MACHINE_HUMIDITY = 55;
    public final static int WATERING_MACHINE_WINDPOWER = 4;
    public WeatherData weatherData;

    /**
     * 根据weather中的天气条件开关机器
     * @param weather
     */
    public abstract void start(Weather weather);

}
