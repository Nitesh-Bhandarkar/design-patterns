package structuralPattern.bridge;

public class TV implements Device{
    private boolean isTurnedOn;
    private int volumeLevel;
    private int currentChannel;
    @Override
    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public void turnOn() {
        if(!isTurnedOn){
            isTurnedOn = true;
            return;
        }

        System.out.println("Already On");
    }

    @Override
    public void setVolumeLevel(int percentage) {
        volumeLevel = percentage;

    }

    @Override
    public int getVolume() {
        return volumeLevel;
    }

    @Override
    public void setChannel(int channelNum) {
        currentChannel = channelNum;

    }

    @Override
    public int getChannel() {
        return currentChannel;
    }

    @Override
    public boolean hasFault() {
        return false;
    }
}
