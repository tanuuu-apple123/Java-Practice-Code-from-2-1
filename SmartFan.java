package smarthome.devices;

public class SmartFan implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Fan turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Fan turned OFF.");
    }

    @Override
    public String getStatus() {
        return isOn ? "Smart Fan is ON" : "Smart Fan is OFF";
    }
}
