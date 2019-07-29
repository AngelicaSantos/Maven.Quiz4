package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices;

    public Food() {
        spices = new LinkedList<>();
    }

    public List<Spice> getAllSpices() {
        return getAllSpices();
    }


    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        return null;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
