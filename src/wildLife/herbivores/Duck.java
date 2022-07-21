package wildLife.herbivores;

import lombok.Getter;

public class Duck extends Herbivore {

    public Duck() {
        super(1, 4, 0.15);
    }

    @Getter
    private static int maxCountOnLocation = 200;
}
