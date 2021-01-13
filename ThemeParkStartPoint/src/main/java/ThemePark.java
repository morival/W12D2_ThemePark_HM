import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark implements IReviewed{

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<Object> objects;
    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.attractions.add();
        this.objects = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        ArrayList<IReviewed> allReviews = new ArrayList();
        attractions.forEach(attraction -> {
            objects.add(attraction);
        });
        stalls.forEach(stall -> {
            objects.add(stall);
        });
        System.out.println(allReviews);
        return allReviews;
    }

    public String getName() {
        return getName();
    }

    public int getRating() {
        return getRating();
    }
}
