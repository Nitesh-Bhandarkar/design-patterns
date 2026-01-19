package structuralPattern.bridge;

public interface Remote {
    void turnOnDevice();
    void increaseVolume(int value);
    void reduceVolume(int value);
    void changeChannel(int channelNum);
    int seeCurrentChannelNum();
    int seeCurrentVolume();
    void mute();
}
