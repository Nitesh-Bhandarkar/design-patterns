package creationalPattern.builder;

public class BuilderPatternTester {
    public static void main(String[] args) {
        Architect architect = new Architect();
        HouseBuilder builder = new HouseBuilder();
        architect.constructFurnishedHouse(builder);
        House house = builder.getHouse();
        System.out.println(house);

        HouseBuilder nextBuilder = new HouseBuilder();
        architect.constructPlainHouse(nextBuilder);
        House plainHouse = nextBuilder.getHouse();
        System.out.println(plainHouse);
    }
}
