package structuralPattern.composite;

public class Navy implements Army{
    private final int soldiers;

    public Navy(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public int getSoldierCount() {
        System.out.printf("Navy count : %s \n", soldiers);
        return soldiers;
    }
}
