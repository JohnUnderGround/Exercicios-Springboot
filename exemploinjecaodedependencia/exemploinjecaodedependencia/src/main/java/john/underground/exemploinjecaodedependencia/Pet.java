package john.underground.exemploinjecaodedependencia;
import john.underground.exemploinjecaodedependencia.interfaces.AnimalInterface;
import john.underground.exemploinjecaodedependencia.model.Dog;

/**
 * @author John
 */
public class Pet {

    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface = new Dog();
        animalInterface.comunicar();
    }
}
