package smarthome.devices;

public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Thermostat turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Thermostat turned OFF.");
    }

    @Override
    public String getStatus() {
        return isOn ? "Smart Thermostat is ON" : "Smart Thermostat is OFF";
    }
}
