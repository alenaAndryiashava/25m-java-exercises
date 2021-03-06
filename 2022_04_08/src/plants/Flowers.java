package plants;

import static plants.Season.SPRING;
import static plants.Season.values;

public class Flowers extends Plants{
    private static int FLOWER_GROW_SEASON = 2;

    public Flowers(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName() + " is not growing in Summer, but flourishing " + getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.println(getName() + " is cat to zero in Autumn " + getHeight());
    }


}
