package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private Map<Spice, Integer> spiceCount = new HashMap<>();

    public List<Spice> getAllSpices() {
        return getAllSpices();
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        for(Spice spice : spiceCount.keySet()){

        }
        return getSpiceCount();
    }

    public void applySpice(Spice spice) {
        spiceCount.merge(spice, 1, Integer::sum);
    }

   
}
