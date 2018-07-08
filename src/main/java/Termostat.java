/**
 * Created by hipoo on 2016-04-13.
 */
public class Termostat {
    private Thermometr thermometr;
    private Heater heater;

    private double minTemp;
    private double maxTemp;

    public Termostat(Thermometr thermometr, Heater heater) {
        this.thermometr = thermometr;
        this.heater = heater;
    }

    public void regulateStep() {
        if (thermometr.getTemperature() < minTemp) {
            heater.heaterOn();
        }
        if (thermometr.getTemperature() > maxTemp) {
            heater.heaterOff();
        }
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
}
