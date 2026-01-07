package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.chairs.PlainChair;
import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.FurnitureFactory;
import creationalPattern.abstractFactory.interfaces.Sofa;
import creationalPattern.abstractFactory.interfaces.Table;
import creationalPattern.abstractFactory.sofas.PlainSofa;
import creationalPattern.abstractFactory.tables.PlainTable;

public class PlainFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair makeChair() {
        return new PlainChair();
    }

    @Override
    public Sofa makeSofa() {
        return new PlainSofa();
    }

    @Override
    public Table makeTable() {
        return new PlainTable();
    }
}
