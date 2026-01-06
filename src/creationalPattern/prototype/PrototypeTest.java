package creationalPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        MrfSmallTyre smallTyre = new MrfSmallTyre(5, 3);
        MrfBigTyre bigTyre = new MrfBigTyre(100, 30);
        MrfSmallTyre smallTyreClone = (MrfSmallTyre) smallTyre.clone();
        MrfBigTyre bigTyreClone = (MrfBigTyre) bigTyre.clone();
        System.out.println(smallTyre);
        System.out.println(smallTyreClone);
        System.out.println(bigTyre);
        System.out.println(bigTyreClone);

        /*************************************************************/

        TyreFactory factory = new TyreFactory();
        List<Tyre> tyreClones = new ArrayList<>();
        for(int i=0; i<3; i++){
            tyreClones.add(factory.getType("Small Tyre"));
            tyreClones.add(factory.getType("Big Tyre"));
        }

        System.out.println(tyreClones);
    }
}
