package ameedf.jb8223.lectures.game.animals;

public class Dog extends AbstractAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }

}
