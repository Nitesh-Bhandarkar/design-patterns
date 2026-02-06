package structuralPattern.composite;

public class Military implements Army{
    private final int soldiers;

    public Military(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public int getSoldierCount() {
        System.out.printf("Military count : %s \n", soldiers);
        return soldiers;
    }
}
