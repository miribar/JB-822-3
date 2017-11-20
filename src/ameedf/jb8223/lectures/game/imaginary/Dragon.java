package ameedf.jb8223.lectures.game.imaginary;

import ameedf.jb8223.lectures.game.animals.AbstractAnimal;
import ameedf.jb8223.lectures.game.animals.AnimalType;

public class Dragon extends AbstractAnimal {

    public Dragon(String name) {
        super(name);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.DRAGON;
    }
}
