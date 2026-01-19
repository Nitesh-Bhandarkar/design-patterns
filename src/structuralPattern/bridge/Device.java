package structuralPattern.bridge;

public interface Device {
    boolean isTurnedOn();
    void turnOn();
    void setVolumeLevel(int percentage);
    int getVolume();
    void setChannel(int channelNum);
    int getChannel();
    boolean hasFault();

}
