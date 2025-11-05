package Assignment;

public class SmartPhone extends Device
implements Power, VolumeControl, Device.Connectivity {

private int currentVolume = 0;          
private String connectedNetwork = null; 
private boolean poweredOn = false;

public SmartPhone(String brand, String model) {
	super(brand, model);
}

@Override
public void turnOn() {
if (!poweredOn) {
    poweredOn = true;
    System.out.println("Turning on the device...");
	}
}

@Override
public void turnOff() {
if (poweredOn) {
    poweredOn = false;
    System.out.println("Turning off the device...");
	}
}

@Override
public void increaseVolume(int level) {
	if (!poweredOn) return;		
	currentVolume = Math.min(100, currentVolume + Math.max(0, level));
	System.out.println("Increasing volume by " + level + " levels.");
}

@Override
public void decreaseVolume(int level) {
	if (!poweredOn) return;
	currentVolume = Math.max(0, currentVolume - Math.max(0, level));
	System.out.println("Decreasing volume by " + level + " levels.");
}

@Override
public void connectToWiFi(String networkName) {
	if (!poweredOn) return;
	connectedNetwork = networkName;
	System.out.println("Connecting to WiFi: " + connectedNetwork);
}

@Override
public void disconnectFromWiFi() {
	if (!poweredOn) return;
	if (connectedNetwork != null) {
    System.out.println("Disconnecting from WiFi...");
    connectedNetwork = null;
	}
}

public int getCurrentVolume() {
		return currentVolume;
	}

public String getConnectedNetwork() {
		return connectedNetwork;
	}
}


