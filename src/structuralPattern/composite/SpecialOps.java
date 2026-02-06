package structuralPattern.composite;

public class SpecialOps implements Army{
    private final int soldiers;

    public SpecialOps(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public int getSoldierCount() {
        System.out.printf("SpecialOps count : %s \n", soldiers);
        return soldiers;
    }
}
