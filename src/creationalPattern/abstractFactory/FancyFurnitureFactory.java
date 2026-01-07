package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.chairs.FancyChair;
import creationalPattern.abstractFactory.chairs.PlainChair;
import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.FurnitureFactory;
import creationalPattern.abstractFactory.interfaces.Sofa;
import creationalPattern.abstractFactory.interfaces.Table;
import creationalPattern.abstractFactory.sofas.FancySofa;
import creationalPattern.abstractFactory.sofas.PlainSofa;
import creationalPattern.abstractFactory.tables.FancyTable;
import creationalPattern.abstractFactory.tables.PlainTable;

public class FancyFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair makeChair() {
        return new FancyChair();
    }

    @Override
    public Sofa makeSofa() {
        return new FancySofa();
    }

    @Override
    public Table makeTable() {
        return new FancyTable();
    }
}
