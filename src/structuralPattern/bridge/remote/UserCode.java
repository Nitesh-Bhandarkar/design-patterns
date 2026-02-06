package structuralPattern.bridge.remote;

public class UserCode {
    public static void main(String[] args) {
        Remote remote = new BasicRemote(new TV());
        remote.changeChannel(10);
        System.out.println(remote.seeCurrentChannelNum());

        remote = new BasicRemote(new Radio());
        remote.increaseVolume(100);
        remote.mute();
    }
}
