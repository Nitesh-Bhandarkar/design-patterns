package structuralPattern.bridge;

public class BasicRemote implements Remote{
    private final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public int seeCurrentChannelNum() {
        return device.getChannel();
    }

    @Override
    public void turnOnDevice() {
        device.turnOn();

    }

    @Override
    public void increaseVolume(int value) {
        device.setVolumeLevel(value);

    }

    @Override
    public void reduceVolume(int value) {
        device.setVolumeLevel(value);

    }

    @Override
    public int seeCurrentVolume() {
        return device.getVolume();
    }

    @Override
    public void mute() {
        System.out.println("Feature not available");
    }

    @Override
    public void changeChannel(int channelNum) {
        device.setChannel(channelNum);
    }
}
