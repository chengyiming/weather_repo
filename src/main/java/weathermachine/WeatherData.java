package weathermachine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cym
 */
public class WeatherData {
    private List<AbstractMachine> abstractMachineList = new ArrayList<>();

    public WeatherData()
    {
        new ReapingMachine(this);
        new SeedingMachine(this);
        new WateringMachine(this);
    }

    public void measurementsChanged(int temp, int humidity, int windPower)
    {
        Weather weather = new Weather(temp, humidity, windPower);
        abstractMachineList.forEach((machine)->machine.start(weather));
    }


    public void attach(AbstractMachine abstractMachine) {
        abstractMachineList.add(abstractMachine);
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged(1,1, 2);
    }
}
