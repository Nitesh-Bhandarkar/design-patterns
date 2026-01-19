package structuralPattern.bridge;

public class AdvanceRemote implements Remote{
    private final Device device;

    public AdvanceRemote(Device device) {
        this.device = device;
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
    public int seeCurrentVolume() {
        return device.getVolume();
    }

    @Override
    public void reduceVolume(int value) {
        device.setVolumeLevel(value);

    }

    @Override
    public void changeChannel(int channelNum) {
        device.setChannel(channelNum);
    }

    @Override
    public int seeCurrentChannelNum() {
        return device.getChannel();
    }

    @Override
    public void mute(){
        device.setVolumeLevel(0);
    }


}
