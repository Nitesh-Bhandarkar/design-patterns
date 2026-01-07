package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.FurnitureFactory;
import creationalPattern.abstractFactory.interfaces.Sofa;
import creationalPattern.abstractFactory.interfaces.Table;

public class Store {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Store(FurnitureFactory factory) {
        chair = factory.makeChair();
        sofa = factory.makeSofa();
        table = factory.makeTable();
    }

    private String getChairFeature(){
        String str = "Features of chair : \n";
        if(chair.canAdjustHeight()){
            str = str + "1. Height Adjustable \n";
        }
        else {
            str = str + "1. Height is fixed \n";
        }

        if(chair.canBend()){
            str = str + "2. Possible to bend \n";
        }
        else{
            str = str + "2. Can not bend. \n";
        }

        if(chair.hasCushion()){
            str = str + "3. Has cushion \n";
        }
        else {
            str = str + "3. Is plain and simple \n";
        }

        return str;
    }

    private String getSofaFeature(){
        String str = sofa.getType() + " Features : \n";
        if(sofa.canConvertToBed()){
            str = str + "Can convert to bed \n";
        }
        else {
            str = str + "Is only a sofa";
        }

        return str;
    }

    private String getTableFeature(){
        String str = "Features of table : \n";
        str = str + "Table has " + table.getLegs() + " legs";
        if(table.isFoldable()){
            str = str + "Possible to fold";
        }
        else {
            str = str + "not possible to fold";
        }
        return str;
    }

    public void getFeatures(){
        System.out.println(getChairFeature());
        System.out.println("*********************************");
        System.out.println(getSofaFeature());
        System.out.println("*********************************");
        System.out.println(getTableFeature());
        System.out.println("*********************************");
    }
}
