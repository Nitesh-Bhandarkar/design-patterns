package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.chairs.EconomicalChair;
import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.FurnitureFactory;
import creationalPattern.abstractFactory.interfaces.Sofa;
import creationalPattern.abstractFactory.interfaces.Table;
import creationalPattern.abstractFactory.sofas.EconomicalSofa;
import creationalPattern.abstractFactory.tables.EconomicalTable;

public class EconomicalFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair makeChair() {
        return new EconomicalChair();
    }

    @Override
    public Sofa makeSofa() {
        return new EconomicalSofa();
    }

    @Override
    public Table makeTable() {
        return new EconomicalTable();
    }
}
