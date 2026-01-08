package smarthome.devices;

public class SmartLight implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Light turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Light turned OFF.");
    }

    @Override
    public String getStatus() {
        return isOn ? "Smart Light is ON" : "Smart Light is OFF";
    }
}
