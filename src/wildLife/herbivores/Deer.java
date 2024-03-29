package wildLife.herbivores;

import lombok.Getter;
import wildLife.Herbivore;

public class Deer extends Herbivore {

    public Deer() {
        super(300, 4, 50);
    }

    @Getter
    private static int maxCountOnLocation = 20;

    @Override
    public int getMaxCountAnimalsOnLocation() {
        return maxCountOnLocation;
    }
}
