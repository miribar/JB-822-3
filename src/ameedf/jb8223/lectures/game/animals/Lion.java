package ameedf.jb8223.lectures.game.animals;

public class Lion extends AbstractAnimal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.LION;
    }
}
