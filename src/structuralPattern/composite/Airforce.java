package structuralPattern.composite;

public class Airforce implements Army{
    private final int soldiers;

    public Airforce(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public int getSoldierCount() {
        System.out.printf("Air-force count : %s \n", soldiers);
        return soldiers;
    }
}
